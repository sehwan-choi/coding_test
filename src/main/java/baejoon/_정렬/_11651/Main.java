package baejoon._정렬._11651;

/**
 * 문제 url <a href=""></a>
 *
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5\n" +
                "0 4\n" +
                "1 2\n" +
                "1 -1\n" +
                "2 2\n" +
                "3 3";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[][] arr = new Integer[N][2];

        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            arr[i][0] = X;
            arr[i][1] = Y;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1].equals(o2[1])) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        for (int i = 0 ; i < N ; i ++) {
            bw.write(arr[i][0] + " " + arr[i][1]);
            bw.newLine();
        }
        bw.flush();
    }
}
