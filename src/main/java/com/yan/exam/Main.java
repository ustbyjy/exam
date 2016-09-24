package com.yan.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lineList = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if ("".equals(line))
                break;
            lineList.add(line);
        }
        for (int i = 0; i < lineList.size() / 2; i++) {
            int start = Integer.parseInt(lineList.get(i * 2));
            int end = Integer.parseInt(lineList.get(i * 2 + 1));
            System.out.println(valid(start, end));
        }
    }

    private static String valid(int start, int end) {
        List<Integer> numList = new ArrayList<Integer>();
        while (start > 0) {
            numList.add(start % 10);
            start /= 10;
        }
        Collections.sort(numList);
        if (numList.size() > 1 && numList.get(0) == 0) {
            for (int i = 1; i < numList.size(); i++) {
                if (numList.get(i) != 0) {
                    numList.set(0, numList.get(i));
                    numList.set(i, 0);
                    break;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < numList.size(); i++) {
            result = result * 10 + numList.get(i);
        }
        if (result == end)
            return "YES";
        else
            return "NO";
    }
}
