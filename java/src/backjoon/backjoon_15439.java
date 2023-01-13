package backjoon;

import java.io.*;
import java.text.DecimalFormat;

public class backjoon_15439 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	DecimalFormat df = new DecimalFormat("#.##");
    	int N = Integer.parseInt(br.readLine());
    	double b = Math.pow(N, 2) - N;
    	System.out.println(df.format(b));
    }
}

