package baejoon._정렬._10989;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10989"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "10\n" +
                "5\n" +
                "2\n" +
                "3\n" +
                "1\n" +
                "4\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "1\n" +
                "7";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0 ; i < N ; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }
        bw.flush();
    }
}
