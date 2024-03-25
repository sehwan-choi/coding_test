package baejoon._반복문._10952;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10952"></a>
 *
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 입력의 마지막에는 0 두 개가 들어온다.
 *
 * 출력
 * 각 테스트 케이스마다 A+B를 출력한다.
 *
 * 예제 입력 1
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 * 0 0
 * 예제 출력 1
 * 2
 * 5
 * 7
 * 17
 * 7
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "1 1\n2 3\n3 4\n9 8\n5 2\n0 0";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
        bw.flush();
    }
}
