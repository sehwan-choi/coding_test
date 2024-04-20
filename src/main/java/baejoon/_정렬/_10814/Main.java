package baejoon._정렬._10814;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10814"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3\n" +
                "21 Junkyu\n" +
                "21 Dohyun\n" +
                "20 Sunyoung";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];
        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (o1, o2) -> {
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        });

        for (int i = 0 ; i < N ; i++) {
            bw.write(arr[i][0] + " " + arr[i][1]);
            bw.newLine();
        }
        bw.flush();
    }
}
