package baejoon._일반수학1._2720;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2720"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3\n" +
                "124\n" +
                "25\n" +
                "194";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] arr = new int[]{25, 10, 5, 1};

        for (int j = 0 ; j < count ; j++) {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < arr.length; i++) {
                if (T >= arr[i]) {
                    int a = T / arr[i];
                    T -= (arr[i] * a);
                    bw.write(a + " ");
                } else {
                    bw.write("0 ");
                }
            }
            bw.newLine();
        }
        bw.flush();
    }
}
