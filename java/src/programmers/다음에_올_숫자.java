package programmers;

public class ������_��_���� {
	
	class Solution {
	    public int solution(int[] common) {
	        
	        int last = common[common.length-1];
	        // �������� ������� �����ϱ�
	        if(common[1] - common[0] == common[2] - common[1]){
	            // true ����
	            return last+(common[1] - common[0]);
	        }else{
	            // false ���
	            // ��� ������ �׻� ù���� �������� ���°� �ƴϴ�.
	            // 1 2 4��쵵 �ִٰ� �Ѵ�.
	            return last*(common[2]/common[1]);
	        }  
	    }
	}

}
