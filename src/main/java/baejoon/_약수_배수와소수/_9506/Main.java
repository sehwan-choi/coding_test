package baejoon._약수_배수와소수._9506;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/9506"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "6\n" +
                "12\n" +
                "28\n" +
                "-1";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        while (!s.equals("-1")) {
            int N = Integer.parseInt(s);

            int sum = 0;

            ArrayList<String> list = new ArrayList<>();

            for (int i = 1 ; i < N ; i++) {
                if (N % i == 0) {
                    sum += i;
                    list.add(String.valueOf(i));
                }
            }

            sb.append(N);
            if (sum == N) {
                sb.append(" = ");
                for (int i = 0 ; i < list.size()-1 ; i++) {
                    sb.append(list.get(i) + " + ");
                }
                sb.append(list.get(list.size()-1));
            } else {
                sb.append(" is NOT perfect.");
            }
            sb.append("\n");

            s = br.readLine();
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
