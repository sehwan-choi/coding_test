package baejoon._집합과맵._14425;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/14425"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5 11\n" +
                "baekjoononlinejudge\n" +
                "startlink\n" +
                "codeplus\n" +
                "sundaycoding\n" +
                "codingsh\n" +
                "baekjoon\n" +
                "codeplus\n" +
                "codeminus\n" +
                "startlink\n" +
                "starlink\n" +
                "sundaycoding\n" +
                "codingsh\n" +
                "codinghs\n" +
                "sondaycoding\n" +
                "startrink\n" +
                "icerink";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i = 0 ; i < N ; i++) {
            set.add(br.readLine());
        }

        String[] arr = new String[M];
        for (int i = 0 ; i < M ; i++) {
            arr[i] = br.readLine();
        }

        int count = 0;
        for (String next : set) {
            for (int j = 0; j < M; j++) {
                if (next.equals(arr[j])) {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}
