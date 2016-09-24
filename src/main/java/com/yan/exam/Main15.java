package com.yan.exam;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);
        int step = Math.min(a, b);
        int result = -1;
        int resultSub = Integer.MAX_VALUE;
        int cBitSum = getBitSum(c);
        while (step <= Math.max(a, b)) {
            if (Math.abs(getBitSum(step) - cBitSum) < resultSub) {
                resultSub = Math.abs(getBitSum(step) - cBitSum);
                result = step;
            }
            step++;
        }
        System.out.println(result);
    }

    public static int getBitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


}