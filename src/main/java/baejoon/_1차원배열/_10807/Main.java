package baejoon._1차원배열._10807;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10807"></a>
 *
 * 문제
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
 *
 * 출력
 * 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
 *
 * 예제 입력 1
 * 11
 * 1 4 1 2 4 2 4 2 3 4 4
 * 2
 * 예제 출력 1
 * 3
 * 예제 입력 2
 * 11
 * 1 4 1 2 4 2 4 2 3 4 4
 * 5
 * 예제 출력 2
 * 0
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "11\n1 4 1 2 4 2 4 2 3 4 4\n2";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int findNumber = Integer.parseInt(br.readLine());

        int total = 0;

        for (int i = 0 ; i < count ; i++) {
            if (findNumber == Integer.parseInt(array[i])) {
                total++;
            }
        }
        bw.write(String.valueOf(total));
        bw.flush();
    }
}
