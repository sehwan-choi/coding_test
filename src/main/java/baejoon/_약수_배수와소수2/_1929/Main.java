package baejoon._약수_배수와소수2._1929;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1929"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "1 1000000";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A == 1) {
            A++;
        }
        for (int i = A; i <= B; i++) {
            int m = (int) Math.sqrt(i);
            int k = (int) Math.sqrt(B);
            if (m < 2 || k == 1) {
                bw.write(String.valueOf(i));
                bw.newLine();
            } else {
                int count = 0;
                for (int j = 2; j <= m; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }
        }
        bw.flush();
    }
}
