package com.yan.exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/10/20.
 */
public class Main20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] arr = new boolean[n];
        int contNum = 0;
        int index = 0;
        int arrLength = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        while (arrLength > 1) {
            if (arr[index] == true) {
                contNum++;
                if (contNum == 3) {
                    arr[index] = false;
                    arrLength--;
                    contNum = 0;
                }
            }
            index++;
            if (index == arr.length) {
                index = 0;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == true) {
                System.out.println(String.valueOf(j + 1));
            }
        }
    }
}
