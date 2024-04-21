package baejoon._약수_배수와소수2._1934;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1934"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3\n" +
                "1 45000\n" +
                "6 10\n" +
                "13 17";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int tempA = Math.max(A, B);
            int tempB = Math.min(A, B);
            int result = (A * B) / gcd(tempA, tempB);
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
