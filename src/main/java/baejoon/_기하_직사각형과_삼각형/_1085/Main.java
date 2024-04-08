package baejoon._기하_직사각형과_삼각형._1085;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1085"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "6 2 10 3";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int min = X;

        if (X > W && Y > H) {
            min = X - W;
            if (Y - H < min) {
                min = Y - H;
            }
        } else {
            if (W - X < min) {
                min = (W - X);
            }
            if (Y < min) {
                min = Y;
            }
            if (H - Y < min) {
                min = H - Y;
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
    }
}