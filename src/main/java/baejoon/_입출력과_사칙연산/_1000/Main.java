package baejoon._입출력과_사칙연산._1000;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1000"></a>
 *
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 첫째 줄에 A+B를 출력한다.
 *
 * 예제 입력 1
 * 1 2
 *
 * 예제 출력 1
 * 3
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String input = "1 2";
        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(a + b));
        bw.flush();
    }
}
