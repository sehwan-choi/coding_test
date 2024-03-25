package baejoon._입출력과_사칙연산._10430;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10430"></a>
 *
 * 문제
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 *
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 *
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 *
 * 출력
 * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 *
 * 예제 입력 1
 * 5 8 4
 * 예제 출력 1
 * 1
 * 1
 * 0
 * 0
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5 8 4";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf((a+b)%c));
        bw.newLine();
        bw.write(String.valueOf(((a%c) + (b % c))%c));
        bw.newLine();
        bw.write(String.valueOf((a*b)%c));
        bw.newLine();
        bw.write(String.valueOf(((a%c) * (b%c)) % c));
        bw.newLine();
        bw.flush();
    }
}
