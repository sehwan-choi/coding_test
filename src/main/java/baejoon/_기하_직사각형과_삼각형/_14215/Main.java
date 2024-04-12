package baejoon._기하_직사각형과_삼각형._14215;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/14215"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "1 2 3";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        if (arr[2] >= arr[0] + arr[1]){
            arr[2] = arr[0] + arr[1] -1;
        }

        int k = arr[0] + arr[1] + arr[2];
        bw.write(String.valueOf(k));
        bw.flush();
    }
}