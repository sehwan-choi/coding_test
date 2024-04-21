package baejoon._집합과맵._1764;

/**
 * 문제 url <a href=""></a>
 *
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3 4\n" +
                "ohhenrie\n" +
                "charlie\n" +
                "baesangwook\n" +
                "obama\n" +
                "baesangwook\n" +
                "ohhenrie\n" +
                "clinton";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i < N ; i ++) {
            map.put(br.readLine(), 0);
        }

        List<String> list = new ArrayList<>();
        for (int i = 0 ; i < M ; i++) {
            String name = br.readLine();
            Integer k = map.get(name);
            if (k != null) {
                list.add(name);
            }
        }

        bw.write(String.valueOf(list.size()));
        bw.newLine();
        Collections.sort(list);
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
    }
}
