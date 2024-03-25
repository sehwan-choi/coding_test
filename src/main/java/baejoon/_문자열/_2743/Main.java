package baejoon._문자열._2743;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2743"></a>
 *
 * 문제
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 *
 * 출력
 * 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 *
 * 예제 입력 1
 * pulljima
 * 예제 출력 1
 * 8
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "pulljima";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(br.readLine().length()));
        bw.flush();
    }
}
