package baejoon._집합과맵._10816;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10816"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "10\n" +
                "6 3 2 10 10 10 -10 -10 7 3\n" +
                "8\n" +
                "10 9 -5 2 3 4 5 -10";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int S = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < S ; i++) {
            int k = Integer.parseInt(st.nextToken());
            Integer count = map.get(k);
            if (count == null) {
                map.put(k, 1);
            } else {
                map.put(k, count + 1);
            }
        }

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < T ; i++) {
            int t = Integer.parseInt(st2.nextToken());
            Integer re = map.getOrDefault(t, 0);
            bw.write(re + " ");
        }

        bw.flush();
    }
}
