package baejoon._약수_배수와소수._1978;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1978"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "4\n" +
                "1 3 5 7";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i ++) {
            int N2 = Integer.parseInt(st.nextToken());
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 1 ; j <= N2 ; j++) {
                if (N2 % j == 0) {
                    list.add(j);
                }
            }

            if (list.size() == 2) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}
