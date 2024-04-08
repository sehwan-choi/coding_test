package baejoon._기하_직사각형과_삼각형._27323;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/27323"></a>
 *
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "2\n" +
                "3";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        bw.write(String.valueOf((A * B)));
        bw.flush();
    }
}
