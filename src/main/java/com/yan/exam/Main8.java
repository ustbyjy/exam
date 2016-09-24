package com.yan.exam;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String[] strings1 = line1.split(" ");
        int n = Integer.parseInt(strings1[0]);
        int m = Integer.parseInt(strings1[1]);
        String[] strings2 = line2.split(" ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strings2[i]);
        }
        System.out.println(output(n, m, nums));
    }

    public static int output(int n, int m, int[] nums) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] ^ nums[j]) > m)
                    count++;
            }
        }
        return count;
    }

}


