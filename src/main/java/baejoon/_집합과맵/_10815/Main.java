package baejoon._집합과맵._10815;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10815"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5\n" +
                "6 3 2 10 -10\n" +
                "8\n" +
                "10 9 -5 2 3 4 5 -10";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int S = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < S ; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for (int i = 0 ; i < T ; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0 ; i < T ; i++) {
            if (set.contains(arr[i])) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
    }
}
