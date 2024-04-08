package baejoon._기하_직사각형과_삼각형._10101;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/10101"></a>
 *
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "40\n" +
                "40\n" +
                "0";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int Z = Integer.parseInt(br.readLine());

        if (X + Y + Z != 180) {
            bw.write("Error");
        } else {
            if (X == 60 && Y == 60 && Z == 60) {
                bw.write("Equilateral");
            } else if ((X == Y && X != Z) || (X == Z && X != Y) || (Z == Y && Z != X)) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        }
        bw.flush();
    }
}
