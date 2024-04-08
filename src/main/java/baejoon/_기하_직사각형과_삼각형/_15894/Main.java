package baejoon._기하_직사각형과_삼각형._15894;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/15894"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "100";
        // 1 4
        // 2 8
        // 3 12
        // 4 16

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        bw.write(String.valueOf(N*4));
        bw.flush();
    }
}
