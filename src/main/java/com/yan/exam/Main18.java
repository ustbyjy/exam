package com.yan.exam;

import java.util.Scanner;

public class Main18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        output(scanner.nextInt());

    }

    private static void output(int input) {
        if (input <= 0) {
            return;
        }
        if (input > 45) {
            return;
        }
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
