package baejoon._정렬._1427;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1427"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "2143";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split("");
        Integer[] arr = new Integer[split.length];
        for (int i = 0 ; i < split.length ; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        for (int i = 0 ; i < split.length ; i++) {
            bw.write(String.valueOf(arr[i]));
        }
        bw.flush();
    }
}
