package baejoon._시간복잡도._24263;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/24263"></a>
 *
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "7";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(i));
        bw.newLine();
        bw.write("1");
        bw.flush();
    }
}
