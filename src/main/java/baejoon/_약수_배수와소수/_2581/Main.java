package baejoon._약수_배수와소수._2581;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2581"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "64\n" +
                "65";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = M ; M <= N ; M++) {
            if (a(M)) {
                list.add(M);
            }
        }

        int sum = 0;
        for (int i = 0 ; i < list.size() ; i++) {
            sum += list.get(i);
        }

        if (list.size() > 0) {
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(list.get(0)));
        } else {
            bw.write("-1");
        }
        bw.flush();
    }

    public static boolean a(int N) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 1 ; j <= N ; j++) {
            if (N % j == 0) {
                list.add(j);
            }
        }

        if (list.size() == 2) {
            return true;
        }
        return false;
    }
}
