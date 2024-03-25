import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TokenizerTest {

    @Test
    void test() throws Exception {
        String input = "1 2 3\n4,5,6\n7a8a9";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println("st.nextToken() = " + st.nextToken());
        System.out.println("st.nextToken() = " + st.nextToken());
        System.out.println("st.nextToken() = " + st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        System.out.println("st.nextToken() = " + st2.nextToken(","));
        System.out.println("st.nextToken() = " + st2.nextToken(","));
        System.out.println("st.nextToken() = " + st2.nextToken(","));

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        System.out.println("st.nextToken() = " + st3.nextToken("a"));
        System.out.println("st.nextToken() = " + st3.nextToken("a"));
        System.out.println("st.nextToken() = " + st3.nextToken("a"));
    }

    @Test
    void test2() throws Exception {
        String input = "1 2 3\n4,5,6\n7a8a9";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
        String[] s = br.readLine().split(" ");
        for (int i = 0 ; i < s.length ; i ++) {
            System.out.println("st.nextToken() = " + s[i]);
        }

        String[] s2 = br.readLine().split(",");
        for (int i = 0 ; i < s2.length ; i ++) {
            System.out.println("st.nextToken() = " + s[i]);
        }

        String[] s3 = br.readLine().split("a");
        for (int i = 0 ; i < s3.length ; i ++) {
            System.out.println("st.nextToken() = " + s[i]);
        }
    }
}
