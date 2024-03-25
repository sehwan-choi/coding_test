package baejoon._1차원배열._10818;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10818"></a>
 *
 * 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 *
 * 예제 입력 1
 * 5
 * 20 10 35 30 7
 * 예제 출력 1
 * 7 35
 */

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws Exception {
        String input = "5\n20 10 35 30 7";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");

        ArrayList<Integer> arr = new ArrayList<>();
        for (String s : array) {
            int a = Integer.parseInt(s);
            arr.add(a);
        }

        int max = Collections.max(arr);
        int min = Collections.min(arr);
        bw.write(min + " " + max);
        bw.flush();
    }
}
