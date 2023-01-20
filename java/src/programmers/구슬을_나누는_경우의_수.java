package programmers;
import java.math.BigInteger;

public class ������_������_�����_�� {
	
	class Solution {
	    
	    public BigInteger solution(int balls, int share) {
	        
	    	// ���丮���� ���� �迭 �غ�
	        BigInteger[] DP = new BigInteger[31];
	        // �̸� �ε����� 0�� 1�� ���� �� �ֱ�
	        DP[0] = new BigInteger("1");
	        DP[1] = new BigInteger("1");
	        // ������ ���, �ε����� 2�� �ͺ��� ����
	        for (int i = 2; i <= 30; i++) {
	            DP[i] = DP[i - 1].multiply(new BigInteger(Integer.toString(i)));
	        }
	        // ������ �ִ� ���� �� ���ߴٸ� ���� �ٸ� n�� �� m���� �̴� ����� �� ���� ����
	        return (DP[balls].divide(DP[balls - share].multiply(DP[share])));

	    }
	}
	
}

// ���� ��ȹ��(Dynamic Programing, DP)�� ��� ����� ������ �����Ͽ� ������ �ظ� ã�Ƴ��� ����� �˰���
// ó�� ����Ǵ� ������ ����� �ΰ�, �̹� �����ߴ� �����̶�� �ٽ� �����ϴ� ���� �ƴ϶� ��ϵǾ� �ִ� ���� �������� ��
// ���� ������ �ݺ��ؾ� �� ���, �� �� ���� ����� ������ �ξ��ٰ� Ȱ���ϴ� ������� �ߺ� ����� ���̴� ���� �޸������̼�(Memoization)

