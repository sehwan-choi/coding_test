package baejoon._2차원배열._2738;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2738"></a>
 *
 * 문제
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 *
 * 예제 입력 1
 * 3 3
 * 1 1 1
 * 2 2 2
 * 0 1 0
 * 3 3 3
 * 4 4 4
 * 5 5 100
 * 예제 출력 1
 * 4 4 4
 * 6 6 6
 * 5 6 100
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3 4\n" +
                "1 1 1 1\n" +
                "2 2 2 1\n" +
                "0 1 0 1\n" +
                "3 3 3 1\n" +
                "4 4 4 1\n" +
                "5 5 100 1";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer a = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(a.nextToken());
        int m = Integer.parseInt(a.nextToken());

        int[][] arr = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] result = new int[n][m];

        for (int i = 0 ; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < m ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0 ; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < m ; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0 ; i < n ; i ++) {
            for (int j = 0 ; j < m; j++) {
                result[i][j] = arr[i][j] + arr2[i][j];
            }
        }


        for (int i = 0 ; i < n ; i ++) {
            for (int j = 0 ; j < m; j++) {
                bw.write(String.valueOf(result[i][j]));
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
