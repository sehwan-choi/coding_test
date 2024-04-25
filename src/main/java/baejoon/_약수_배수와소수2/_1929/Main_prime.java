package baejoon._약수_배수와소수2._1929;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1929"></a>
 *
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main_prime {
    public static void main(String[] args) throws Exception {
        String input = "3 100000";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[B+1];

        arr[0] = true;
        arr[1] = true;

        for (int i = 2 ; i <= Math.sqrt(B) ; i++) {
            for (int j = i * i ; j <= B ; j +=i) {
                arr[j] = true;
            }
        }

        for (int i = A ; i <= B ; i++) {
            if (!arr[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
    }
}
