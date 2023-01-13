package backjoon;

import java.io.*;
import java.text.DecimalFormat;

public class backjoon_15372 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(br.readLine());
    	DecimalFormat df = new DecimalFormat("#.##");
    	for(int i=1;i<=T;i++) {
        	int n = Integer.parseInt(br.readLine());
            double b = Math.pow(n, 2); 
    		System.out.println(df.format(b));
    	}  	
    }
}

// Ʋ���� ����! ������ ���� int�� ������ ���� �� �־����. �׷��� double�������� �ϰ� ��������� �ٲ���!
// DecimalFormat df=new DecimalFormat("#.##"); #�� 0�ϰ�� ǥ������ �ʽ��ϴ�.
// �ð��ʰ��� ���´�... ���� scanner�� �������� ���� �� ���ϱ�?
// Scanner �Է� ��� BufferedReader�� ���
// ������ ������� '�� ����' �о�� �� ���ۿ� ����. ����ڰ� �䱸�� �� ���ۿ��� �о���� �Ѵ�. (O) -> �ӵ� ���, �ð� ���� ���� �� �ִ�
// �Է°��� ���� ���� ȿ���鿡�� ��!
// Scanner�� ���� ������� 1024 chars VS BufferedReader�� ���� ������� 8192 chars
// Scanner: space�� ��� ���� �ν�. �����ϱ� ����. ȿ�� ����
// BufferedReader: enter�� ���� �ν�. ���� �����Ͱ� String���� ����. �Է¹��� �����͸� Ÿ�� ��ȯ/�Ľ� �ؾ� ��. ���� �����͸� �Է¹��� ��� ȿ�� ����
// �Է°��� ������ String Ÿ���̱⿡ �ϳ��ϳ� Ÿ�� ��ȯ����� ��
// Scanner�� �޸� Exception ó���� ��ü������ �Ǿ����� �ʱ⿡ ���� Exception ó������� ��
// ���� ������ �Է¹ޱ� ������, �� �ٿ� ������ ���� ���� ���� �Էµ� ����� �Ľ��� �ʼ� -> StringTokenizer ����ϸ� ��
// �������...
