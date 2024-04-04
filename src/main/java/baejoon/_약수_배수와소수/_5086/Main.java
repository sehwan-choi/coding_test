package baejoon._약수_배수와소수._5086;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/5086"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "8 16\n" +
                "32 4\n" +
                "17 5\n" +
                "0 0";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String next = br.readLine();
        while (next != null) {
            StringTokenizer st = new StringTokenizer(next);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if ( a == 0 && b == 0){
                break;
            }

            if ( a > b) {
                if ( a % b ==0 ){
                    bw.write("multiple");
                } else {
                    bw.write("neither");
                }
            } else {
                if ( b % a ==0 ) {
                    bw.write("factor");
                } else {
                    bw.write("neither");
                }
            }
            bw.newLine();
            next = br.readLine();
        }
        bw.flush();
    }
}
