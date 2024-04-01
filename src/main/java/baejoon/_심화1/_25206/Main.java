package baejoon._심화1._25206;

/**
 * 문제 url <a href="https://www.acmicpc.net/problem/25206"></a>
 *
 */

import java.io.*;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String input = "ObjectOrientedProgramming1 3.0 A+\n" +
                "IntroductiontoComputerEngineering 3.0 A+\n" +
                "ObjectOrientedProgramming2 3.0 A0\n" +
                "CreativeComputerEngineeringDesign 3.0 A+\n" +
                "AssemblyLanguage 3.0 A+\n" +
                "InternetProgramming 3.0 B0\n" +
                "ApplicationProgramminginJava 3.0 A0\n" +
                "SystemProgramming 3.0 B0\n" +
                "OperatingSystem 3.0 B0\n" +
                "WirelessCommunicationsandNetworking 3.0 C+\n" +
                "LogicCircuits 3.0 B0\n" +
                "DataStructure 4.0 A+\n" +
                "MicroprocessorApplication 3.0 B+\n" +
                "EmbeddedSoftware 3.0 C0\n" +
                "ComputerSecurity 3.0 D+\n" +
                "Database 3.0 C+\n" +
                "Algorithm 3.0 B0\n" +
                "CapstoneDesigninCSE 3.0 B+\n" +
                "CompilerDesign 3.0 D0\n" +
                "ProblemSolving 4.0 P";

        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double h_sum = 0;

        ArrayList<Double> list = new ArrayList<>();

        int i = 0;
        while (true) {
            String s = br.readLine();
            if (s== null) {
                break;
            }
            String[] split = s.split(" ");
            if (!split[2].equals("P")) {
                double h = Double.parseDouble(split[1]);
                h_sum += h;
                double p = find(split[2]);
                list.add(h * p);
            } else {
                list.add(0.0);
            }
            i++;
        }

        double r_sum = 0;
        for (int j = 0 ; j < list.size() ; j++) {
            r_sum += list.get(j) / h_sum;
        }
        bw.write(String.valueOf(r_sum));
        bw.flush();
    }

    public static double find(String p) {
        if (p.equals("A+")) {
            return 4.5;
        } else if (p.equals("A0")) {
            return 4.0;
        } else if (p.equals("B+")) {
            return 3.5;
        } else if (p.equals("B0")) {
            return 3.0;
        } else if (p.equals("C+")) {
            return 2.5;
        } else if (p.equals("C0")) {
            return 2.0;
        } else if (p.equals("D+")) {
            return 1.5;
        } else if (p.equals("D0")) {
            return 1.0;
        }
        return 0.0;
    }
}
