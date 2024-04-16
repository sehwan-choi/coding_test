package baejoon._브루트포스._19532;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/19532"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "1 3 -1 4 1 7";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ax = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int dx = Integer.parseInt(st.nextToken());
        int ey = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int x = ax + dx;
        int y = by + ey;
        int t = c + f;

        for (int i = -999 ; i <= 999 ; i++) {
            for (int j = -999 ; j <= 999 ; j++) {
                if (ax * i + by * j == c) {
                    if (dx * i + ey * j == f) {
                        bw.write(i + " " + j);
                        break;
                    }
                }
            }
        }
        bw.flush();
    }
}
