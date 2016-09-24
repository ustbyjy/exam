package com.yan.exam;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/19.
 */
public class ReturnLastWordLength {

    @Test
    public void test() {
        String s = "Hello World";
        System.out.println(getLastWordLength(s));

        String s1 = "Hello World   ";
        System.out.println(getLastWordLength(s1));

        String s2 = "   ";
        System.out.println(getLastWordLength(s2));

        String s3 = "";
        System.out.println(getLastWordLength(s3));
    }

    public int getLastWordLength(String s) {
        if (s == null && "".equals(s))
            return 0;
        boolean start = false;
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                start = true;
                len++;
            } else if (start)
                break;
        }
        return len;
    }
}
