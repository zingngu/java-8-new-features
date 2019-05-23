package com.zingsrepo.learning;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        integers.stream().forEach(x -> System.out.print(x));
        integers.parallelStream().forEach(x -> System.out.print(x));
    }
}
