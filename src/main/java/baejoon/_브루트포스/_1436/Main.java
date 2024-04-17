package baejoon._브루트포스._1436;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1436"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "187";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int series = 666;
        int count = 1;

        while(count < N) {
            series+=1;
            int k = 0;
            int temp = series;
            while(temp != 0) {
                int a = temp % 10;
                temp /= 10;

                if (a == 6) {
                    k++;
                } else if (k < 3) {
                    k=0;
                }
            }

            if (k >= 3) {
                count++;
            }
        }
        bw.write(String.valueOf(series));
        bw.flush();
    }
}
