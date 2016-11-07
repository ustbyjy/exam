package com.yan.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main19 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            String line = cin.nextLine();
            if ("".equals(line.trim()))
                break;
            list.add(line);
        }
        StringBuilder sb = new StringBuilder();
        int b1 = 0;
        int b2 = 0;
        sb.append(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            b2 = 0;
            String str = list.get(i);
            for (char c : str.toCharArray()) {
                if (c == ' ') b2++;
                else break;
            }
            if (b2 > b1)
                sb.append("(").append(str);
            else if (b2 == b1)
                sb.append(",").append(str);
            else {
                for (int j = 0; j < b1 - b2; j++) {
                    sb.append(")");
                }
                sb.append(",").append(str);
            }
            b1 = b2;
        }
        for (int j = 0; j < b2; j++) {
            sb.append(")");
        }
        System.out.println(sb.toString().replaceAll(" ", ""));
    }
}
