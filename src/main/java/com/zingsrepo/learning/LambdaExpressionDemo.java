package com.zingsrepo.learning;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
            }
        }).start();

        Runnable runnable = () -> System.out.println("t2");
        new Thread(runnable).start();

        new Thread(() -> System.out.println("t3")).start();

        new Thread(() -> {
            String s = "t4";
            System.out.println(s);
        }).start();

        List<Character> characters = Arrays.asList('x', 'y', 'z');
        characters.forEach((e) -> System.out.println(e));
    }
}
