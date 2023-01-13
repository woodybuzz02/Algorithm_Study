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

// 틀리는 이유! 제곱한 수가 int의 범위를 넘을 수 있어서였다. 그래서 double형식으로 하고 출력형식을 바꾸자!
// DecimalFormat df=new DecimalFormat("#.##"); #은 0일경우 표현하지 않습니다.
// 시간초과가 나온다... 이제 scanner을 쓰지않을 때가 온 것일까?
// Scanner 입력 대신 BufferedReader를 사용
// 일정량 사이즈로 '한 번에' 읽어온 후 버퍼에 보관. 사용자가 요구할 때 버퍼에서 읽어오게 한다. (O) -> 속도 향상, 시간 부하 줄일 수 있다
// 입력값이 많을 수록 효율면에서 굳!
// Scanner의 버퍼 사이즈는 1024 chars VS BufferedReader의 버퍼 사이즈는 8192 chars
// Scanner: space를 모두 경계로 인식. 가공하기 쉽다. 효율 낮음
// BufferedReader: enter만 경계로 인식. 받은 데이터가 String으로 고정. 입력받은 데이터를 타입 변환/파싱 해야 함. 많은 데이터를 입력받을 경우 효율 좋음
// 입력값은 무조건 String 타입이기에 하나하나 타입 변환해줘야 함
// Scanner와 달리 Exception 처리가 자체적으로 되어있지 않기에 따로 Exception 처리해줘야 함
// 라인 단위로 입력받기 때문에, 한 줄에 공란을 경계로 여러 값이 입력된 경우라면 파싱이 필수 -> StringTokenizer 사용하면 됨
// 힘들었당...
