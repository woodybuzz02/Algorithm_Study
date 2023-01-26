package programmers.Lv0;

public class 배열_원소의_길이 {
	
	


class Solution {
    public int[] solution(String[] strlist) {
        int l = strlist.length;
        int[] answer = new int[l];
        for(int i=0; i<l; i++){
             String str = strlist[i];
             answer[i] = str.length();
        }
        return answer;
    }
}

}
