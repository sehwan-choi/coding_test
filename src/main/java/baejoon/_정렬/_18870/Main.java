package baejoon._정렬._18870;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/18870"></a>
 *
 */
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5\n" +
                "2 4 -10 4 -9";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] narr = Stream.of(arr)
                .distinct()
                .sorted()
                .toArray(Integer[]::new);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i <narr.length ; i++) {
            map.put(narr[i], i);
        }

        for (int i = 0 ; i < N ; i++) {
            Integer k = map.get(arr[i]);
            bw.write(k + " ");
        }

        bw.flush();
    }
}
