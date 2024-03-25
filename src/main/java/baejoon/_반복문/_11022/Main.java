package baejoon._반복문._11022;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/11022"></a>
 *
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 *
 * 예제 입력 1
 * 5
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 * 예제 출력 1
 * Case #1: 1 + 1 = 2
 * Case #2: 2 + 3 = 5
 * Case #3: 3 + 4 = 7
 * Case #4: 9 + 8 = 17
 * Case #5: 5 + 2 = 7
 */
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5\n1 1\n2 3\n3 4\n9 8\n5 2";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 1 ; i <= count ; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.format("Case #%d: %d + %d = %d", i, a, b, (a+b)));
            bw.newLine();
        }
        bw.flush();
    }
}
