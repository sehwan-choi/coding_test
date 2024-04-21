package baejoon._약수_배수와소수2._4134;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/4134"></a>
 *
 */
import java.io.*;
import java.util.*;
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
            int n = Integer.parseInt(br.readLine());
            while(true) {
                int k = (int) Math.sqrt(n);
                for (int j = 2; j < k; j++) {

                }
            }
        }
    }
}
