package baejoon._2차원배열._2566;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2566"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3 23 85 34 17 74 25 52 65\n" +
                "10 7 39 42 88 52 14 72 63\n" +
                "87 42 18 78 53 45 18 84 53\n" +
                "34 28 64 85 12 16 75 36 55\n" +
                "21 77 45 35 28 75 90 76 1\n" +
                "25 87 65 15 28 11 37 28 74\n" +
                "65 27 75 41 7 89 78 64 39\n" +
                "47 47 70 91 23 65 3 41 44\n" +
                "87 13 82 38 31 12 29 29 80";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];
        for (int i = 0 ; i < 9 ; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for (int j = 0 ; j < 9 ; j++) {
                String token = st.nextToken();
                arr[i][j] = Integer.parseInt(token);
            }
        }

        int max =-1;
        int n=0;
        int m=0;
        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0 ; j < 9 ; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    n = (i + 1);
                    m = (j + 1);
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(n + " " + m);
        bw.flush();
    }
}
