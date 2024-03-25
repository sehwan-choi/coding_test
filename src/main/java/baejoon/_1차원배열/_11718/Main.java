package baejoon._1차원배열._11718;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/11718"></a>
 *
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	236052	72963	60642	33.509%
 * 문제
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 *
 * 출력
 * 입력받은 그대로 출력한다.
 *
 * 예제 입력 1
 * Hello
 * Baekjoon
 * Online Judge
 * 예제 출력 1
 * Hello
 * Baekjoon
 * Online Judge
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "Hello\nBaekjoon\nOnline Judge";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        while (s != null) {
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }
        bw.flush();
    }
}
