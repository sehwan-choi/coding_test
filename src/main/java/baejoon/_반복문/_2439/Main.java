package baejoon._반복문._2439;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2439"></a>
 *
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
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
 *     *
 *    **
 *   ***
 *  ****
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
        for (int i = 1 ; i <= count ; i ++) {
            for (int j = 1 ; count - i >= j ; j ++) {
                bw.write(" ");
            }
            for (int k = 1 ; k <= i ; k ++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
