package baejoon._정렬._2587;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2587"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "10\n" +
                "40\n" +
                "30\n" +
                "60\n" +
                "30";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int[] arr = new int[5];
        for (int i = 0 ; i < 5 ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0 ; i < 5 ; i++) {
            sum += arr[i];
        }

        bw.write(String.valueOf(sum/5));
        bw.newLine();
        bw.write(String.valueOf(arr[2]));
        bw.flush();
    }
}
