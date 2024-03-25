package baejoon._입출력과_사칙연산._1008;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1008"></a>
 *
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 *
 * 예제 입력 1
 * 1 3
 *
 * 예제 출력 1
 * 0.33333333333333333333333333333333
 * 10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.
 *
 * 예제 입력 2
 * 4 5
 *
 * 예제 출력 2
 * 0.8
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String input = "1 3";
        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
//        bw.write(String.valueOf((float)a / b));
        bw.write(String.valueOf((double)a / b));
        bw.flush();
    }
}
