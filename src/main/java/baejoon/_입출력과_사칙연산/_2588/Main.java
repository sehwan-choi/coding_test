package baejoon._입출력과_사칙연산._2588;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2588"></a>
 *
 * 문제
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *
 *
 *
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 *
 * 출력
 * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 *
 * 예제 입력 1
 * 472
 * 385
 * 예제 출력 1
 * 2360
 * 3776
 * 1416
 * 181720
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        String input = "472\n" +
                "385";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int start = Integer.parseInt(br.readLine());
        int sum = 0;
        int kk = 1;
        for (int i = 1 ; i <= 3; i ++) {
            int result = a * (start % 10);
            bw.write(String.valueOf(result));
            bw.newLine();
            sum += result * kk;
            start /= 10;
            kk *= 10;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
