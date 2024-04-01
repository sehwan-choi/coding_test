package baejoon._일반수학1._11005;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/11005"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "60466173 36";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLine = br.readLine();
        StringTokenizer st = new StringTokenizer(readLine);
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        List<Character> list = new ArrayList<>();

        while (N > 0) {
            if (N % B > 9) {
                list.add((char)((N % B) + 55));
            } else {
                list.add((char) ((N % B) + '0'));
            }
            N /= B;
        }
        for (int j = list.size() - 1 ; j >= 0 ; j --) {
            bw.write(list.get(j));
        }
        bw.flush();
    }
}
