package study;

import java.io.*;
import java.util.StringTokenizer;

public class 빠른입력_빠른출력 {

    public static void main(String[] args) throws IOException {
        String a = "3\n" +
                "1 1\n" +
                "2 2 3\n" +
                "3 4 5 6";
        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(a.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());

            for (int j = 0 ; j < s ; j++) {
                int data = Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(data));
                bw.newLine();
            }
        }
        bw.flush();
    }
}
