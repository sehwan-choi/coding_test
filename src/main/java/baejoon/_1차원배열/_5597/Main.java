package baejoon._1차원배열._5597;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/5597"></a>
 *
 * X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
 *
 * 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
 *
 * 출력
 * 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
 *
 * 예제 입력 1
 * 3
 * 1
 * 4
 * 5
 * 7
 * 9
 * 6
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 18
 * 19
 * 20
 * 21
 * 22
 * 23
 * 24
 * 25
 * 26
 * 27
 * 28
 * 29
 * 30
 * 예제 출력 1
 * 2
 * 8
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3\n1\n4\n5\n7\n9\n6\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 30 ; i++) {
            list.add(i+1);
        }

        for (int i = 0 ; i < 28 ; i++) {
            int target = Integer.parseInt(br.readLine());
            list.removeIf(f -> f.equals(target));
        }

        bw.write(String.valueOf(list.get(0)));
        bw.newLine();
        bw.write(String.valueOf(list.get(1)));
        bw.flush();
    }
}
