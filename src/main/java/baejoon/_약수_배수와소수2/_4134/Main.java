package baejoon._약수_배수와소수2._4134;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/4134"></a>
 *
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3\n" +
                "6\n" +
                "20\n" +
                "100";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < N ; i++) {
            long n = Long.parseLong(br.readLine());
            while (true) {
                long count = 0;
                for (long j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    if (n == 0 || n == 1) {
                        n = 2;
                    }
                    bw.write(String.valueOf(n));
                    bw.newLine();
                    break;
                }
                n++;
            }
        }
        bw.flush();
    }
}
