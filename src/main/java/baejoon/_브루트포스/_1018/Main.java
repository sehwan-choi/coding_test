package baejoon._브루트포스._1018;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1018"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "9 23\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
                "BBBBBBBBBBBBBBBBBBBBBBW";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        boolean[][] arr = new boolean[X][Y];

        // W = true
        for (int i = 0 ; i < Y ; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0 ; j < X ; j++) {
                arr[j][i] = split[j].equals("W");
            }
        }

        int x_pos = 0;
        int y_pos = 0;
        int x_max_pos = X - 8;
        int y_max_pos = Y - 8;
        int min = 32;
        while(true) {
            int count = 0;

            boolean start = arr[x_pos][y_pos];
            for (int i = x_pos ; i < x_pos + 8 ; i++) {
                for (int j = y_pos ; j < y_pos + 8 ; j++) {
                    if (arr[i][j] != start) {
                        count++;
                    }
                    start = !start;
                }
                start = !start;
            }

            /*
             *  생각을 깊이해보기!!
             *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
             *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
             *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장
             */
            int total = Math.min(count, 64 - count);
            if (min > total) {
                min = total;
            }

            x_pos +=1;
            if (x_pos > x_max_pos) {
                x_pos = 0;
                y_pos +=1;
            }
            if (y_pos > y_max_pos) {
                break;
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
    }
}
