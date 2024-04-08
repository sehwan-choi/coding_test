package baejoon._기하_직사각형과_삼각형._9063;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/9063"></a>
 *
 */

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3\n" +
                "-20 -24\n" +
                "-40 -21\n" +
                "-10 -12";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tX = Integer.parseInt(st.nextToken());
        int tY = Integer.parseInt(st.nextToken());

        int _1max = tX;
        int _1min = tX;
        int _2max = tY;
        int _2min = tY;


        for (int i = 0 ; i < N-1 ; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st2.nextToken());
            int Y = Integer.parseInt(st2.nextToken());
            if (X > _1max) {
                _1max = X;
            }
            if (X < _1min) {
                _1min = X;
            }
            if (Y > _2max) {
                _2max = Y;
            }
            if (Y < _2min) {
                _2min = Y;
            }
        }
        int i = (_1max - _1min) * (_2max - _2min);
        if (i < 0 ) {
            i *= -1;
        }
        bw.write(String.valueOf(i));
        bw.flush();
    }
}
