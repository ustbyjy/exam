package com.yan.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line == null || "".equals(line.trim()))
                break;
            list.add(Integer.parseInt(line));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                char[] c = new char[list.get(i) * 2];
                getString(0, c);
                if (i != list.size())
                    System.out.println();
            }
        }
    }

    public static void getString(int index, char[] c) {
        if (index == c.length)
            print(c);
        else if (index == 0) {
            c[0] = '(';
            getString(index + 1, c);
        } else if (index == c.length - 1) {
            c[c.length - 1] = ')';
            getString(index + 1, c);
        } else {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '(')
                    count1++;
                else if (c[i] == ')')
                    count2++;
            }
            if (count1 < c.length / 2) {
                if (count2 < count1) {
                    char[] c1 = c.clone();
                    c1[index] = '(';
                    char[] c2 = c.clone();
                    c2[index] = ')';
                    c = null;
                    getString(index + 1, c1);
                    getString(index + 1, c2);
                } else {
                    c[index] = '(';
                    getString(index + 1, c);
                }
            } else {
                c[index] = ')';
                getString(index + 1, c);
            }
        }
    }

    private static void print(char[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}