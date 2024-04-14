package baejoon._브루트포스._2798;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/2798"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "10 500\n" +
                "93 181 245 214 315 36 185 138 400 295";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        ArrayList<Integer> arr = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < N ; i++) {
             int a = Integer.parseInt(st.nextToken());
             arr.add(a);
        }

        Collections.sort(arr);

        int max = 0;
        for (int i = 0 ; i < arr.size() ; i ++) {
            for (int j = i + 1 ; j < arr.size() ; j++) {
                for (int k = j + 1 ; k < arr.size() ; k++) {
                    int a = arr.get(i) + arr.get(j) + arr.get(k);
                    if (a > M) {
                        break;
                    }
                    if ((M- max) > (M - a)) {
                        max = a;
                        break;
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}
