package com.yan.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = Integer.parseInt(in.nextLine());
        int r = Integer.parseInt(in.nextLine());
        List<Integer> list = new ArrayList<Integer>();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = Integer.parseInt(in.nextLine());
        }
        while (r <= a.length) {
            f(a, r++);
        }
        System.out.println(a[0]);
    }

    private static void f(int[] a, int r) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            int[] n = new int[r];
            for (int j = i; j < r + i; j++) {
                if (j == i) {
                    n[j - i] = a[j];
                } else {
                    n[j - i] = a[j % a.length];
                }
            }
            quickSort(n, 0, n.length - 1);
            b[i] = n[r / 2];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }

    private static void quickSort(int[] n, int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quickSort(n, left, dp - 1);
            quickSort(n, dp + 1, right);
        }
    }

    private static int partition(int[] n, int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }
}