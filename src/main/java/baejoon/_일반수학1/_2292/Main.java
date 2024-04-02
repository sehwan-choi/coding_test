package baejoon._일반수학1._2292;


/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2292"></a>
 *
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "37";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int num = 1;
        int init = 6;
        int plus = 5;
        int count = 1;
        int check = 1;

        while (N > num) {
            count ++;
            num += init;
            init += 6;
        }

        bw.write(String.valueOf(count));
        bw.flush();

        // 1 - 1       -> 1
        // 2 - 2 ~ 7   -> 6
        // 3 - 8 ~ 19  -> 12 6
        // 4 - 20 ~ 37 -> 18 6
        // 5 - 38 ~ 61 -> 24 6
    }
}
