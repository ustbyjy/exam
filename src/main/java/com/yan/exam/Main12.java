package com.yan.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/22.
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        String[] strings1 = line1.split(" ");
        int n = Integer.parseInt(strings1[0]);
        int sum = Integer.parseInt(strings1[1]);
        String[] strings2 = line2.split(" ");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strings2[i]);
        }
        System.out.println(count(nums, sum));
    }

    public static int count(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        return process(arr, 0, aim);
    }

    public static int process(int[] arr, int index, int aim) {
        int res = 0;
        if (index == arr.length) {
            res = aim == 0 ? 1 : 0;
        } else {
            for (int i = 0; i <= 1 && arr[index] * i <= aim; i++) {
                res += process(arr, index + 1, aim - arr[index] * i);
            }
        }
        return res;
    }

}