package com.yan.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        if (scanner.hasNextLine()) {
            count = Integer.parseInt(scanner.nextLine());
        }
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            int row, column;
            if (scanner.hasNextLine()) {
                String[] strings = scanner.nextLine().split(" ");
                row = Integer.parseInt(strings[0]);
                column = Integer.parseInt(strings[1]);
                char[][] chars = new char[row][column];
                for (int j = 0; j < row; j++) {
                    String line = scanner.nextLine();
                    chars[j] = line.toCharArray();
                }
                num(chars, resultList);
            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
    }

    private static void num(char[][] chars, List<Integer> resultList) {
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (chars[i][j] == '1' && i + 1 < chars.length && j + 1 < chars[i].length && chars[i][j + 1] == '1' && chars[i + 1][j] == '1' && chars[i + 1][j + 1] == '1')
                    result++;
            }
        }
        resultList.add(result);
    }
}
