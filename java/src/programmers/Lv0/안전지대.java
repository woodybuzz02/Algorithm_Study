package programmers.Lv0;

public class �������� {
	
	// ��¥ �� �ȵǴ� ���� �� �𸣰ڴ�... �׽�Ʈ 7���� ����� �ȵȴ�.
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
	        
	        // �ı��� ���� �����ַ��� ���� �迭
	        int[][] board2 = new int[n][n];
	        
	        for(int i = 0; i < n; i++){
	            for(int j = 0; j < n; j++){
	                if(board[i][j] == 1){
	                    // ��ź ������ �ı��Ǿ����!
	                   Destroy(i, j, n, board2);
	                }
	            }
	        }
	        
	        // 0�� ���� ���� ����
	        for(int i = 0; i < board2.length; i++) {
	            for(int j = 0; j < board2.length; j++) {
	                if(board2[i][j] == 0) answer++;
	            }
	        }
	        
	        return answer;
	    }
	    
	    // �ı�!
	    private void Destroy(int i, int j, int n, int[][] board2) {
	    	// private static void Destroy(int i, int j, int n, int[][] board2) {
	        // r = row, c = column
	        for(int r = i-1; r < i+2; r++) {
	            // r�� ���� �Ѿ�� �׳� �Ѿ��!
	            if(r < 0 || r >= n) continue;
	            // �ƴ϶�� c�� ���� ���캻��.
	            else {
	                // c�� ���� �Ѿư��� �׳� �Ѿ��
	                for(int c = j-1; c < j+2; c++) {
	                    if(c < 0 || c >= n) continue;
	                    // �ƴ϶�� 1 �ֱ�
	                    else board2[r][c] = 1;
	                    }
	                }
	            }
	        }
	}

}
