package com.yan.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if ("".equals(line.trim()))
                break;
            stringList.add(line);
        }
        for (String s : stringList) {
            System.out.println(max(s));
        }
    }

    public static int max(String s) {
        int aIndex = s.indexOf('A');
        int bIndex = s.indexOf('B');
        int cIndex = s.indexOf('C');
        int dIndex = s.indexOf('D');
        int eIndex = s.indexOf('E');
        if (aIndex < 0 || bIndex < 0 || cIndex < 0 || dIndex < 0 || eIndex < 0)
            return 0;
        char[] arr = s.toCharArray();
        int result = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C' || arr[i] == 'D' || arr[i] == 'E') {
                result = Math.max(result, temp);
                temp = 0;
            } else {
                temp++;
            }
        }
        return result;
    }

}
