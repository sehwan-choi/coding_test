package baejoon._문자열._9086;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/9086"></a>
 *
 *문제
 * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
 *
 * 출력
 * 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
 *
 * 예제 입력 1
 * 3
 * ACDKJFOWIEGHE
 * O
 * AB
 * 예제 출력 1
 * AE
 * OO
 * AB
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3\nACDKJFOWIEGHE\nO\nAB";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < count ; i++) {
            String string = br.readLine();
            int start = 0;
            int end = string.length() -1;
            bw.write(String.valueOf(string.charAt(start)) + string.charAt(end));
            bw.newLine();
        }
        bw.flush();
    }
}
