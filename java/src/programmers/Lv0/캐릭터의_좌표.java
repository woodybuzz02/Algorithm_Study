package programmers.Lv0;

public class 캐릭터의_좌표 {
	
	class Solution {
	    public int[] solution(String[] keyinput, int[] board) {
	        int [] a = {0,0};
	        // 가로크기 board[0] 11이라면 -5,0 0,5
	        // 가로크기 board[0] 7이라면 -3,0 0,3
	        // 세로크기 board[1] 9이라면 -4,0 0,4
	        int c = (board[0]-1)/2;
	        int d = (board[1]-1)/2;
	        for(int i=0;i<keyinput.length;i++){
	            if(keyinput[i].equals("left")){
	                a[0] -= 1;
	                if(a[0] == -c-1){
	                    a[0] += 1;
	                }
	            }else if(keyinput[i].equals("right")){
	                a[0] += 1;
	                if(a[0] == c+1){
	                    a[0] -= 1;
	                }
	            }else if(keyinput[i].equals("up")){
	                a[1] += 1;
	                if(a[1] == d+1){
	                    a[1] -= 1;
	                }
	            }else if(keyinput[i].equals("down")){
	                a[1] -= 1;
	                if(a[1] == -d-1){
	                    a[1] += 1;
	                }
	            }
	        }
	        return a;
	    }
	}

}
