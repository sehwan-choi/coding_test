package baejoon._기하_직사각형과_삼각형._5073;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/5073"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "7 7 7\n" +
                "6 5 4\n" +
                "3 2 5\n" +
                "6 2 6\n" +
                "0 0 0";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[3];

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] == 0 && arr[1] ==  0 && arr[2] == 0) {
                break;
            }

            Arrays.sort(arr);
            if (arr[2] >= arr[0] + arr[1]) {
                bw.write("Invalid\n");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                bw.write("Equilateral\n");
            } else if ((arr[0] == arr[1] && arr[0] != arr[2]) || (arr[0] == arr[2] && arr[0] != arr[1]) || (arr[1] == arr[2] && arr[0] != arr[1])){
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
        }
        bw.flush();
    }
}
