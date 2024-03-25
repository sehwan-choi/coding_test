package baejoon._문자열._10809;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10809"></a>
 *
 * 입력
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 *
 * 출력
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 *
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 *
 * 예제 입력 1
 * baekjoon
 * 예제 출력 1
 * 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "baekjoon";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        int[] arr = new int[26];

        for (int i = 0, k = 'a' ; i < arr.length ; i++, k++) {
            for (int j = 0 ; j < string.length() ; j++) {
                if (k == string.charAt(j)) {
                    arr[i] = j;
                    break;
                } else {
                    arr[i] = -1;
                }
            }
        }

        for (int i = 0 ; i < arr.length ; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
    }
}
