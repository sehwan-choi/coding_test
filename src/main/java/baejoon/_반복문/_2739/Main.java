package baejoon._반복문._2739;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2739"></a>
 *
 * 문제
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 *
 * 입력
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 *
 * 출력
 * 출력형식과 같게 N*1부터 N*9까지 출력한다.
 *
 * 예제 입력 1
 * 2
 * 예제 출력 1
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * 2 * 4 = 8
 * 2 * 5 = 10
 * 2 * 6 = 12
 * 2 * 7 = 14
 * 2 * 8 = 16
 * 2 * 9 = 18
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3";

        BufferedReader rw = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader rw = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(rw.readLine());

        for (int i = 1 ; i < 10 ; i ++) {
            bw.write(n + " * " + i + " = " + (n*i));
            bw.newLine();
        }
        bw.flush();

    }
}
