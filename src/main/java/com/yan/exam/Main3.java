package com.yan.exam;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int second = 0;
        if (scanner.hasNextInt()) {
            second = scanner.nextInt();
            output(second);
        }
    }

    private static void output(int input) {
        if (input <= 0)
            System.out.println(0 + " " + 0);
        String start = "B";
        StringBuilder sb = new StringBuilder();
        while (--input > 0) {
            for (int i = 0; i < start.length(); i++) {
                if (start.charAt(i) == 'B')
                    sb.append("BA");
                else
                    sb.append("B");
            }
            start = sb.toString();
            sb.delete(0, sb.length());
        }
        int countA = 0, countB = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'A')
                countA++;
            else
                countB++;
        }
        System.out.println(countA + " " + countB);
    }
}
