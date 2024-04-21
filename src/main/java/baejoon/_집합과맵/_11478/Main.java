package baejoon._집합과맵._11478;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/11478"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "ababc";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split("");

        Set<String> set = new HashSet<>(List.of(split));
        int n = 0;
        while ( n < split.length) {
            String start = split[n];
            int nn = n + 1;
            while(nn < split.length) {
                start += split[nn];
                set.add(start);
                nn++;
            }
            n++;
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
    }
}
