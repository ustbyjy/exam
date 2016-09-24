package com.yan.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/22.
 */
public class Main10 {

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}, {6, 10}};
        int[][] nums1 = {{1, 5}, {3, 7}, {9, 17}};
        int[][] result = union(nums1);
        for (int i = 0; i < result.length; i++) {
            System.out.println("[" + result[i][0] + "," + result[i][1] + "] ");
        }
    }

    public static int[][] union(int[][] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i][0]);
            max = Math.max(max, nums[i][1]);
        }
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int index = min;
        while (index <= max) {
            map.put(index, Boolean.FALSE);
            index++;
        }
        for (int i = 0; i < nums.length; i++) {
            int[] line = nums[i];
            for (int j = line[0]; j <= line[1]; j++) {
                map.put(j, Boolean.TRUE);
            }
        }
        index = min;
        boolean start = false;
        int len = 0;
        while (index <= max) {
            if (map.get(index) == Boolean.TRUE) {
                start = true;
                if (index == max)
                    len++;
            } else if (start) {
                start = false;
                len++;
            }
            index++;
        }
        int[][] result = new int[len][2];
        len = 0;
        index = min;
        while (index <= max) {
            if (map.get(index) == Boolean.TRUE) {
                start = true;
                if (map.get(index - 1) == null || map.get(index - 1) == Boolean.FALSE)
                    result[len][0] = index;
                if (index == max) {
                    result[len][1] = index;
                    len++;
                }
            } else if (start) {
                start = false;
                result[len][1] = index - 1;
                len++;
            }
            index++;
        }
        return result;
    }

}
