package com.yan.exam;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in1 = Integer.parseInt(input.nextLine());
        int in2 = Integer.parseInt(input.nextLine());
        int bits = 0;
        int temp = in1;
        while (temp > 0) {
            bits++;
            temp /= 10;
        }
        if (in1 <= 0 || bits <= in2) {
            System.out.println(0);
            return;
        }
        int out = max(in1, in2);
        System.out.println(out);


    }

    public static int max(int a, int k) {
        StringBuffer sb = new StringBuffer(a + "");
        int i, j;
        for (i = 0; i < k; i++) {
            for (j = 0; j < sb.length() - 1 && sb.charAt(j) >= sb.charAt(j + 1); j++) {

            }
            sb.delete(j, j + 1);

        }
        return sb.length() == 0 ? 0 : Integer.parseInt(sb.toString());
    }

}


