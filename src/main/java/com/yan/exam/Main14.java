package com.yan.exam;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());
        System.out.println(getNext(input));
    }

    public static int getNext(int n) {
        int c = n;
        int c0 = 0;
        int c1 = 0;
        while ((c & 1) == 0 && (c != 0)) {
            c0++;
            c >>= 1;
        }
        while ((c & 1) == 1) {
            c1++;
            c >>= 1;
        }
        if (c0 + c1 == 31 || c0 + c1 == 0)
            return -1;
        int p = c0 + c1;
        n |= (1 << p);
        n &= ~((1 << p) - 1);
        n |= (1 << (c1 - 1)) - 1;
        return n;
    }

}