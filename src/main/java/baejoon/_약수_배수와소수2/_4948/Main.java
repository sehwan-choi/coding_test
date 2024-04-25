package baejoon._약수_배수와소수2._4948;

/**
 * 문제 url <a href=""></a>
 *
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "1\n" +
                "10\n" +
                "13\n" +
                "100\n" +
                "1000\n" +
                "10000\n" +
                "100000\n" +
                "0";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        while(N != 0) {
            int k =(2*N)+1;
            boolean[] arr = new boolean[k];
            arr[0] = arr[1] = true;
            int count = 0 ;

            for (int i = 2 ; i < Math.sqrt(k) ; i++) {
                for (int j = i * i ; j < k ; j += i) {
                    arr[j] = true;
                }
            }

            for (int i = (N +1) ; i < k ; i++) {
                if (!arr[i]) {
                    count++;
                }
            }

            bw.write(String.valueOf(count));
            bw.newLine();
            N = Integer.parseInt(br.readLine());
        }
        bw.flush();
    }
}
