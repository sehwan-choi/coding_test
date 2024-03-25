package baejoon._1차원배열._10871;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10871"></a>
 *
 * 문제
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 *
 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 *
 * 출력
 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 *
 * 예제 입력 1
 * 10 5
 * 1 10 4 9 2 3 8 5 7 6
 * 예제 출력 1
 * 1 4 2 3
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "10 5\n1 10 4 9 2 3 8 5 7 6";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int standard = Integer.parseInt(st.nextToken());

        String[] array = br.readLine().split(" ");
        for (int i = 0 ; i < count ; i++) {
            int num = Integer.parseInt(array[i]);
            if (standard > num) {
                bw.write(num + " ");
            }
        }

//        StringTokenizer st2 = new StringTokenizer(br.readLine());
//        while (st2.hasMoreTokens()) {
//            int num = Integer.parseInt(st2.nextToken());
//            if (standard > num) {
//                bw.write(num + " ");
//            }
//        }
        bw.flush();
    }
}
