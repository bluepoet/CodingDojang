package net.bluepoet.algorithm.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

/**
 * Created by bluepoet on 2016. 11. 11..
 * reference : http://codingdojang.com/scode/504?answer_mode=hide
 */
public class Basic504_1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5);
        Map<Integer, Integer> map = numbers.stream().collect(groupingBy(Function.identity(), summingInt(e -> 1)));
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
