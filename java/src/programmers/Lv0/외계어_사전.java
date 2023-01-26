package programmers.Lv0;

public class 외계어_사전 {
	
	class Solution {
	    public int solution(String[] spell, String[] dic) { 
	        for(int i=0; i<dic.length; i++){
	            int a = 0;
	            for(int j=0; j<spell.length; j++){
	                if(dic[i].contains(spell[j])){
	                    a++;
	                }
	            }
	            if(a==spell.length){
	                return 1;
	            }    
	        }
	        return 2;
	    }
	}

}
