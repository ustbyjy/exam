package com.yan.exam;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        String[] strings = line.split(" ");
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(jump(nums));
    }

    public static int jump(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        int jump = 0;
        int cur = 0;
        int next = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cur < i) {
                jump++;
                cur = next;
            }
            next = Math.max(next, i + arr[i]);
        }
        return jump;
    }

}
