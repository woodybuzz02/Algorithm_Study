package programmers;

public class �ֺ�_���ϱ� {
	

class Solution {
    public int solution(int[] array) {
    	
        int[] index = new int[1001];
        
        // index�� �ε������� array�� ���� ǥ���Ѵ�.
        // array���� 1�̶�� index[1]�� ++�ȴ�.
        for(int i=0; i<array.length; i++){
            index[array[i]] ++;
        }
        
        int max = 0;
        int max_index = 0;
        
        // index�� ���� �󵵼��� ��Ÿ����.
        // ���� ���� ���� �ε����� �ֺ��̴�.
        for(int i=0; i<index.length; i++){
            if(max<index[i]){
                max = index[i];
                max_index = i;
            }
        }
        
        int count = 0;
        
        // �ֺ��� �������� �� �ִ�. count�� �ֺ��� ���� ������ Ȯ���Ѵ�.
        for(int i = 0; i<index.length; i++){
            if(index[i] == max) {
                count++;
            }
        }
        
        // �ֺ��� �������̸� count�� 1�ʰ��̴�. �׷��� -1�� �����Ѵ�.
        // �ƴ϶�� �ֺ��� ����Ѵ�.
        if(count > 1){
            return -1;
        }else{
            return max_index;
        }
    }
}

}
