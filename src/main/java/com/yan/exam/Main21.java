package com.yan.exam;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2017-03-19
 * Time: 19:11
 */
public class Main21 {
    private static String symbol1 = "/\\";
    private static String symbol2 = "__";
    private static String symbol3 = "+";
    private static String symbol4 = "-";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNum = Integer.parseInt(scanner.nextLine());
        String[] lines = new String[lineNum];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lineNum; i++) {
            lines[i] = scanner.nextLine();
        }
        for (int i = 0; i < lineNum; i++) {
            String line = lines[i];
            if (line.startsWith(symbol3) || line.startsWith(symbol4)) {
                for (int j = 0; j < line.length(); j++) {
                    sb.append(line.charAt(j) == '+' ? symbol1 : symbol2);
                }
            } else {
                for (int j = 0; j < line.length(); j += 2) {
                    sb.append(line.charAt(j) == '/' ? symbol3 : symbol4);
                }
            }
            System.out.println(sb);
            sb.delete(0, sb.length());
        }
    }
}
