package baejoon._심화1._52;

/**
 * 문제 url <a href="https://www.acmicpc.net/step/52"></a>
 *
 * 문제
 * 동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
 *
 * 체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
 *
 * 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
 *
 * 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
 *
 * 예제 입력 1
 * 0 1 2 2 2 7
 * 예제 출력 1
 * 1 0 0 0 0 1
 * 예제 입력 2
 * 2 1 2 1 2 1
 * 예제 출력 2
 * -1 0 0 1 0 7
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "0 1 2 2 2 7";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = new int[]{1,1,2,2,2,8};
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] target = new int[chess.length];
        for (int i = 0 ; i < chess.length ; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0 ; i < chess.length ; i++) {
            bw.write(chess[i] - target[i] + " ");
        }
        bw.flush();
    }
}
