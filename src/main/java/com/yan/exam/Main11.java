package com.yan.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/22.
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if ("".equals(line.trim()))
                break;
            String[] strings = line.split(" ");
            int n = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);
            transform(n, m);
        }
    }

    public static void transform(int n, int m) {
        int[] array = new int[100];
        int location = 0;
        while (n != 0) {
            int remainder = n % m;
            n = n / m;
            array[location] = remainder;
            location++;
        }
        show(array, location - 1);
    }

    public static void show(int[] arr, int n) {
        for (int i = n; i >= 0; i--) {
            if (arr[i] > 9) {
                System.out.print((char) (arr[i] + 55));
            } else {
                System.out.print(arr[i] + "");
            }
        }
    }
}