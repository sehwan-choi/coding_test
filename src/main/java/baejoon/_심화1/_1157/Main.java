package baejoon._심화1._1157;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1157"></a>
 *
 * 문제
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 *
 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 *
 * 출력
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 *
 * 예제 입력 1
 * Mississipi
 * 예제 출력 1
 * ?
 * 예제 입력 2
 * zZa
 * 예제 출력 2
 * Z
 * 예제 입력 3
 * z
 * 예제 출력 3
 * Z
 * 예제 입력 4
 * baaa
 * 예제 출력 4
 * A
 */

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "Mississipi";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int max = 0;
        int max2 = 0;
        String maxStr ="";

        for (int i = 0 ; i < s.length() ; i++) {
            int start = 0;

            int num = 0;
            while(true) {

                int a = s.indexOf(s.charAt(i), start);
                if (a==-1) {
                    break;
                }
                num++;
                start = a + 1;
            }

            if (num >= max) {
                max2 = max;
                max = num;
                maxStr = String.valueOf(s.charAt(i));
            }
        }

        if (max == max2) {
            bw.write("?");
        } else {
            bw.write(maxStr);
        }
        bw.flush();
    }
}
