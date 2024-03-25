package baejoon._심화1._2444;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2444"></a>
 *
 * 문제
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 출력
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 *
 * 예제 입력 1
 * 5
 * 예제 출력 1
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int total = (count*2) -1;

        for (int i = 1 ; i <= total/2 ; i++) {
            for (int j = total/2 ; j-i >= 0 ; j--) {
                bw.write(" ");
            }
            for (int j = 0 ; j < i; j++) {
                bw.write("*");
            }
            for (int j = 1 ; j < i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }


        for (int i = (total+1)/2 ; i >= 0  ; i--) {
            for (int j = total/2 ; j-i >= 0 ; j--) {
                bw.write(" ");
            }
            for (int j = 0 ; j < i; j++) {
                bw.write("*");
            }
            for (int j = 1 ; j < i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
