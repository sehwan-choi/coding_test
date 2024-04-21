package baejoon._약수_배수와소수2._13241;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/13241"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "121 199";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long max = Math.max(A, B);
        long min = Math.min(A, B);

        long result = (A * B) / gcd(max, min);

        bw.write(String.valueOf(result));
        bw.flush();
    }

    static long gcd(long a, long b){
        if (b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
