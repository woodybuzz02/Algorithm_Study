package programmers;

public class 최빈값_구하기 {
	

class Solution {
    public int solution(int[] array) {
    	
        int[] index = new int[1001];
        
        // index의 인덱스값이 array의 값을 표현한다.
        // array값이 1이라면 index[1]이 ++된다.
        for(int i=0; i<array.length; i++){
            index[array[i]] ++;
        }
        
        int max = 0;
        int max_index = 0;
        
        // index의 값은 빈도수를 나타낸다.
        // 가장 높은 값의 인덱스는 최빈값이다.
        for(int i=0; i<index.length; i++){
            if(max<index[i]){
                max = index[i];
                max_index = i;
            }
        }
        
        int count = 0;
        
        // 최빈값이 여러개일 수 있다. count로 최빈값이 여러 개인지 확인한다.
        for(int i = 0; i<index.length; i++){
            if(index[i] == max) {
                count++;
            }
        }
        
        // 최빈값이 여러개이면 count는 1초과이다. 그래서 -1을 리턴한다.
        // 아니라면 최빈값을 출력한다.
        if(count > 1){
            return -1;
        }else{
            return max_index;
        }
    }
}

}
