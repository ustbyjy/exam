package com.yan.exam;

/**
 * final test
 * Created by Administrator on 2016/9/22.
 */
public class Main9 {
    public final static int NUM = 10;

    public static void main(String[] args) {
        final Person p1 = new Person("haha", 10);
        System.out.println(p1);
        modify(p1);
        System.out.println(p1);
        p1.name = "heihei";
        p1.age = 20;
        System.out.println(p1);

        System.out.println(NUM);
        modify(NUM);
        System.out.println(NUM);
    }

    public static void modify(Person person) {
        person = new Person("heihei", 20);
    }

    public static void modify(int num) {
        num++;
    }
}
