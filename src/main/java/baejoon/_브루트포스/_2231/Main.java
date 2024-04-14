package baejoon._브루트포스._2231;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2231"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "216";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0 ; i < N ; i++) {
            int num = i;
            int sum = 0;

            while (num !=0) {
                sum += num % 10;
                num /= 10;
            }

            if ( sum + i == N){
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
