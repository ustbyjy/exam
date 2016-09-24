package com.yan.exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Administrator on 2016/9/22.
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(count(line));
    }

    public static int count(String line) {
        if (line == null || "".equals(line.trim()))
            return 0;
        int step = line.length() / 2;
        Set<String> set = new HashSet<String>();
        for (int i = 1; i <= step; i++) {
            for (int j = 0; (j + 2 * i) <= line.length(); j++) {
                if (line.substring(j, j + i).equals(line.substring(j + i, j + 2 * i)))
                    set.add(line.substring(j, j + i + 1));
            }
        }
        return set.size();
    }

}