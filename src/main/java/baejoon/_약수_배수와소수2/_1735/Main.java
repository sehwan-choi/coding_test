package baejoon._약수_배수와소수2._1735;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/1735"></a>
 *
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "1 4\n1 4";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A_U = Integer.parseInt(st.nextToken());
        int A_D = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int B_U = Integer.parseInt(st2.nextToken());
        int B_D = Integer.parseInt(st2.nextToken());

        int tempU = 0;
        int tempD = 0;
        if (A_D == B_D) {
            tempU = A_U + B_U;
            tempD = A_D;
        } else {
            tempU = (A_U * B_D) + (B_U * A_D);
            tempD = (A_D * B_D);
        }

        int max = Math.max(tempU,tempD);
        int min = Math.min(tempU,tempD);
        int gcd = gcd(max, min);
        if (gcd == 1) {
            bw.write(tempU + " " + tempD);
        } else {
            bw.write((tempU / gcd) + " " + (tempD / gcd));
        }
        bw.flush();
    }

    static int gcd(int a, int b) {
        if (b == 0 ) {
            return a;
        }
        return gcd(b, a%b);
    }
}
