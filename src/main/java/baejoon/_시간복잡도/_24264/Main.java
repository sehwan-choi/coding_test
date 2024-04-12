package baejoon._시간복잡도._24264;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/24264"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "7";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        bw.write(String.valueOf(N * N));
        bw.newLine();
        bw.write(String.valueOf(2));
        bw.flush();
    }
}
