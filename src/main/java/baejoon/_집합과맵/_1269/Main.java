package baejoon._집합과맵._1269;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1269"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3 5\n" +
                "1 2 4\n" +
                "2 3 4 5 6";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> set1 = new HashSet<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++) {
            set1.add(Integer.parseInt(st2.nextToken()));
        }

        Set<Integer> set2 = new HashSet<>();
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < M ; i++) {
            set2.add(Integer.parseInt(st3.nextToken()));
        }

        Set<Integer> copySet1 = new HashSet<>(set1);
        Set<Integer> copySet2 = new HashSet<>(set2);

        copySet1.removeAll(set2);
        copySet2.removeAll(set1);

        bw.write(String.valueOf(copySet1.size() + copySet2.size()));
        bw.flush();
    }
}
