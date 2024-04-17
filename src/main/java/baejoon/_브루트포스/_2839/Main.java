package baejoon._브루트포스._2839;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2839"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5000";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int min = 1666;
        // 3x + 5y = N
        for (int i = 0 ; i <= 1000 ; i++) {
            for (int j = 0 ; j <= 1666 ; j++) {
                if ((5 * i) + (3 * j) == N){
                    if (min > (i + j)) {
                        min = i+j;
                    }
                }
            }
        }

        if (min == 1666 ) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(min));
        }
        bw.flush();
    }
}
