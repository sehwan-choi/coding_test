package baejoon._집합과맵._7785;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/7785"></a>
 *
 */

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "4\n" +
                "Baha enter\n" +
                "Askar enter\n" +
                "Baha leave\n" +
                "Artem enter";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String check = st.nextToken();
            if ("leave".equals(check)) {
                set.remove(name);
            } else {
                set.add(name);
            }
        }

        List<String> list = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for(String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
    }
}
