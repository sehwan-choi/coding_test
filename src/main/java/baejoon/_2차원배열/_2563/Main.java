package baejoon._2차원배열._2563;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2563"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3\n" +
                "3 7\n" +
                "15 7\n" +
                "5 2";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        boolean arr[][] = new boolean[100][100];

        for (int i = 0 ; i < 100 ; i++) {
            Arrays.fill(arr[i], false);
        }


        for (int i = 0 ; i < count ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            for (int j = 0 ; j < 10 ; j++) {
                for (int k = 0 ; k < 10 ; k++) {
                    arr[y+k][x+j] = true;
                }
            }
        }

        int num = 0;
        for (int i  = 0 ; i < 100 ; i++) {
            for (int j = 0 ; j < 100 ; j++) {
                if (arr[i][j]) {
                    num++;
                }
            }
        }

        bw.write(String.valueOf(num));
        bw.flush();
    }
}
