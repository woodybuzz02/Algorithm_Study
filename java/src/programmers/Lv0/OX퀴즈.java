package programmers.Lv0;
import java.util.*;

public class OXÄûÁî {
	
	class Solution {
	    public String[] solution(String[] quiz) {
	        
	        List<String> arrayList = new ArrayList<>();
	        
	        int a0 = 0;
	        int a2 = 0;
	        int a4 = 0;
	        
	        for(String q : quiz){
	            String[] a = q.split(" ");
	            if(a[1].equals("+")){
	                a0 = Integer.parseInt(a[0]);
	                a2 = Integer.parseInt(a[2]);
	                a4 = Integer.parseInt(a[4]);
	                if(a0+a2==a4){
	                    arrayList.add("O");
	                }else{
	                    arrayList.add("X");
	                }
	            }else{
	                a0 = Integer.parseInt(a[0]);
	                a2 = Integer.parseInt(a[2]);
	                a4 = Integer.parseInt(a[4]);
	                if(a0-a2==a4){
	                    arrayList.add("O");
	                }else{
	                    arrayList.add("X");
	                } 
	            }
	        }
	        
	        String[] result = arrayList.stream().toArray(String[]::new);
	        
	        return result;
	    }
	}
	
}
