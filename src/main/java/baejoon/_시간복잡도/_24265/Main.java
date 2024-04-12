package baejoon._시간복잡도._24265;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/24265"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1 ; i <= N - 1 ; i++) {
            for (int j = i + 1 ; j <= N ; j++) {
                count++;
            }
        }
        System.out.println(count);

        // f(n) = a1n + a0
        //
    }
}
