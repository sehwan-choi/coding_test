package baejoon._반복문._2438;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2438"></a>
 *
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 * 예제 입력 1
 * 5
 * 예제 출력 1
 * *
 * **
 * ***
 * ****
 * *****
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < count ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
