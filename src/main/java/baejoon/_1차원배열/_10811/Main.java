package baejoon._1차원배열._10811;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10811"></a>
 *
 * 문제
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
 *
 * 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
 *
 * 바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
 *
 * 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
 *
 * 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
 *
 * 출력
 * 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
 *
 * 예제 입력 1
 * 5 4
 * 1 2
 * 3 4
 * 1 4
 * 2 2
 * 예제 출력 1
 * 3 4 1 2 5
 *
 * 1-1 2-2 3-3 4-4 5-5
 * 1-2 2-1 3-3 4-4 5-5
 * 1-2 2-1 3-4 4-3 5-5
 * 1-3 2-4 3-1 4-2 5-5
 * 3 4 1 2 5
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "5 4\n" +
                "1 2\n" +
                "3 4\n" +
                "1 4\n" +
                "2 2";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int bucket = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] arr = new int[bucket];

        for (int i = 0 ; i < bucket ; i++) {
            arr[i] = (i+1);
        }

        for (int i = 0 ; i < count ; i ++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            int size = b - a + 1;
            int temp[] = new int[size];

            for (int j = 0,k = (a -1) ; k < b ; j++, k++) {
                temp[j] = arr[k];
            }

            for (int j = (a - 1), k = 0 ; j <= (b - 1) ; j++, k++) {
                arr[j] = temp[(size - 1) - k];
            }
        }

        for (int i = 0 ; i < arr.length ; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
    }
}
