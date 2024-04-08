package baejoon._약수_배수와소수._11653;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/11653"></a>
 *
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "72";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(N); i++) {    // 또는 i * i <= N
            while (N % i == 0) {
                bw.write(String.valueOf(i));
                bw.newLine();
                N /= i;
            }
        }

        if (N != 1) {
            bw.write(String.valueOf(N));
            bw.newLine();
        }
        bw.flush();
    }
}
