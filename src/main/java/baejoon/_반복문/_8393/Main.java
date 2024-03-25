package baejoon._반복문._8393;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/8393"></a>
 *
 * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * 출력
 * 1부터 n까지 합을 출력한다.
 *
 * 예제 입력 1
 * 3
 * 예제 출력 1
 * 6
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 1 ; i <= num ; i ++) {
            sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
