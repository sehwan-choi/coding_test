package baejoon._집합과맵._10816;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10816"></a>
 *
 */

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_왜틀린걸까 {
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
        int[] arr = new int[S];
        for (int i = 0 ; i < S ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < T ; i++) {
            map.put(Integer.parseInt(st2.nextToken()), 0);
        }

        for (int a : arr) {
            Integer i = map.get(a);
            if (i != null) {
                map.put(a, i+1);
            }
        }
        for (Integer i : map.keySet()) {
            bw.write(map.get(i) + " ");
        }
        bw.flush();
    }
}
