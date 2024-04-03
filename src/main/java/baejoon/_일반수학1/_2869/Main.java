package baejoon._일반수학1._2869;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2869"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5 3 6";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int total = 0;

        int a = A - B;
        int day = Math.round(V / (float)a);

        if ()

        bw.write(String.valueOf(day));
        bw.flush();
    }
}
