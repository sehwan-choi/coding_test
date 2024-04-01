package baejoon._일반수학1._2745;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2745"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "ZZZZ1 36";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        int idx = 1;

        for (int i = N.length() -1 ; i >= 0  ; i--) {
            char c = N.charAt(i);
            if ( c < 'A') {
                sum += (c - 48) * idx;
            } else {
                sum += (c - 55) * idx;
            }
            idx *= B;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
