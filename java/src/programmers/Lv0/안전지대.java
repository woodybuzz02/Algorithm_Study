package programmers.Lv0;

public class 안전지대 {
	
	// 진짜 왜 안되는 건지 잘 모르겠다... 테스트 7에서 통과가 안된다.
//	class Solution {
//	    public int solution(int[][] board) {
//	        
//	        int n = board.length;
//	        int[][] board2 = new int[n][n];
//	        
//	        for(int i = 0; i < n; i++){
//	            for(int j = 0; j < n; j++){
//	                if(board[i][j] == 1){
//	                    for(int k = -1; k <= 1; k++){
//	                        int a = 0;
//	                        if(i+k != -1 && i+k != n){
//	                            a = i+k;
//	                        }
//	                        for(int l = -1; l <= 1; l++){
//	                            int b = 0;
//	                            if(j+l != -1 && j+l != n){
//	                                b = j+l;
//	                            }
//	                            board2[a][b] = 1;
//	                        }
//	                    }
//	                }
//	            }
//	        }
//	        
//	        int answer = 0;
//	         for(int i = 0; i < n; i++){
//	            for(int j = 0; j < n; j++){
//	                if(board2[i][j] == 0){
//	                    answer++;
//	                }
//	            }
//	          }
//	        
//	        return answer;
//	    }
//	}	
	
	class Solution {
	    public int solution(int[][] board) {
	        
	        int answer = 0;
	        
	        int n = board.length;
	        
	        // 파괴된 지역 보여주려고 만든 배열
	        int[][] board2 = new int[n][n];
	        
	        for(int i = 0; i < n; i++){
	            for(int j = 0; j < n; j++){
	                if(board[i][j] == 1){
	                    // 폭탄 만나면 파괴되어야지!
	                   Destroy(i, j, n, board2);
	                }
	            }
	        }
	        
	        // 0인 지역 갯수 세기
	        for(int i = 0; i < board2.length; i++) {
	            for(int j = 0; j < board2.length; j++) {
	                if(board2[i][j] == 0) answer++;
	            }
	        }
	        
	        return answer;
	    }
	    
	    // 파괴!
	    private void Destroy(int i, int j, int n, int[][] board2) {
	    	// private static void Destroy(int i, int j, int n, int[][] board2) {
	        // r = row, c = column
	        for(int r = i-1; r < i+2; r++) {
	            // r이 범위 넘어가면 그냥 넘어가기!
	            if(r < 0 || r >= n) continue;
	            // 아니라면 c의 범위 살펴본다.
	            else {
	                // c가 범위 넘아가면 그냥 넘어가기
	                for(int c = j-1; c < j+2; c++) {
	                    if(c < 0 || c >= n) continue;
	                    // 아니라면 1 넣기
	                    else board2[r][c] = 1;
	                    }
	                }
	            }
	        }
	}

}
