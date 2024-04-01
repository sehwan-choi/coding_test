package baejoon._2차원배열._10798;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10798"></a>
 *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "AABCDD\n" +
                "afzz\n" +
                "09121\n" +
                "a8EWg6\n" +
                "P5h3kx";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[5][];

        int max = 0;

        for (int i = 0 ; i < 5 ; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0 ; j < split.length ; j++) {
                if (arr[i] == null) {
                    arr[i] = new String[split.length];
                }
                arr[i][j] = split[j];

                if (j > max) {
                    max = j;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < (max +1) ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                if (arr[j].length <= i){
                    continue;
                }
                String a = arr[j][i];
                if (a != null) {
                    sb.append(a);
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
