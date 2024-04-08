package baejoon._기하_직사각형과_삼각형._3009;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/3009"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5 5\n" +
                "5 7\n" +
                "7 5";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr1[] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int arr2[] = new int[]{Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken())};
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int arr3[] = new int[]{Integer.parseInt(st3.nextToken()), Integer.parseInt(st3.nextToken())};

        int x = 0;
        int y = 0;

        if (arr1[0] == arr2[0]) {
            x = arr3[0];
        } else if (arr1[0] == arr3[0]) {
            x = arr2[0];
        } else {
            x = arr1[0];
        }

        if (arr1[1] == arr2[1]) {
            y = arr3[1];
        } else if (arr2[1] == arr3[1]) {
            y = arr1[1];
        } else {
            y = arr2[1];
        }

        bw.write(x + " " + y);
        bw.flush();
    }
}
