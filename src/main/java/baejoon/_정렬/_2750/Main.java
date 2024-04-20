package baejoon._정렬._2750;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2750"></a>
 *
 */

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5\n" +
                "5\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "1";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[] arr= new Integer[N];
        for (int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        for (int i = 0 ; i < N ; i ++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
    }
}
