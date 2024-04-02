package baejoon._일반수학1._2903;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2903"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int init = 1;
        int up = 3;

        for (int i = 1; i < N; i++) {
            init *= 2;
            up += init;
        }

        bw.write(String.valueOf(up*up));

        bw.flush();
        // 2
        // 1 3    1     =9
        // 2 5    2     =25
        // 3 9    4     =36
        // 4 17   8
        // 5 33   16
    }
}
