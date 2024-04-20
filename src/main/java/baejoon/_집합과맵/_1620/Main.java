package baejoon._집합과맵._1620;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1620"></a>
 *
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "26 5\n" +
                "Bulbasaur\n" +
                "Ivysaur\n" +
                "Venusaur\n" +
                "Charmander\n" +
                "Charmeleon\n" +
                "Charizard\n" +
                "Squirtle\n" +
                "Wartortle\n" +
                "Blastoise\n" +
                "Caterpie\n" +
                "Metapod\n" +
                "Butterfree\n" +
                "Weedle\n" +
                "Kakuna\n" +
                "Beedrill\n" +
                "Pidgey\n" +
                "Pidgeotto\n" +
                "Pidgeot\n" +
                "Rattata\n" +
                "Raticate\n" +
                "Spearow\n" +
                "Fearow\n" +
                "Ekans\n" +
                "Arbok\n" +
                "Pikachu\n" +
                "Raichu\n" +
                "25\n" +
                "Raichu\n" +
                "3\n" +
                "Pidgey\n" +
                "Kakuna";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for (int i = 1 ; i <= N ; i++) {
            String name = br.readLine();
            map.put(name, i);
            map2.put(i, name);
        }

        for (int i = 0 ; i < M ; i++) {
            String s = br.readLine();
            try {
                int n = Integer.parseInt(s);
                bw.write(map2.get(n));
            } catch (Exception e) {
                bw.write(String.valueOf(map.get(s)));
            }
            bw.newLine();
        }
        bw.flush();
    }
}
