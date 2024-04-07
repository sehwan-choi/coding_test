package baejoon._약수_배수와소수._2501;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2501"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "10 4";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        int num = 0;
        for (int i = 1 ; i <= N ; i ++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    num = i;
                    break;
                } else if (count > K) {
                    break;
                }
            }
        }

        bw.write(String.valueOf(num));
        bw.flush();
    }
}
