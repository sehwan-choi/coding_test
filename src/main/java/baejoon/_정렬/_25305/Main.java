package baejoon._정렬._25305;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/25305"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5 2\n" +
                "100 76 85 93 98";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i ++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr, Comparator.reverseOrder());
        bw.write(String.valueOf(arr[K-1]));
        bw.flush();
    }
}
