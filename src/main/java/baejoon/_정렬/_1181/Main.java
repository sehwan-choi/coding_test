package baejoon._정렬._1181;

/**
 * 문제 url <a href=""></a>
 *
 */
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "13\n" +
                "but\n" +
                "i\n" +
                "wont\n" +
                "hesitate\n" +
                "no\n" +
                "more\n" +
                "no\n" +
                "more\n" +
                "it\n" +
                "cannot\n" +
                "wait\n" +
                "im\n" +
                "yours";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0 ; i < N ; i++) {
            arr[i] = br.readLine();
        }

        String[] narr = Stream.of(arr).distinct().toArray(String[]::new);

        Arrays.sort(narr, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });

        for (String s : narr) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
    }
}
