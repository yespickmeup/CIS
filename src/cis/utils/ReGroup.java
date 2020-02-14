/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.utils;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Ronescape
 */
public class ReGroup {

    public static void main(String[] args) {
        String[] stmt = {"A1", "B", "A", "C", "A", "C", "E", "E", "F", "F"};
        Map<String, Long> freq = Stream.of(stmt).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        System.out.println(freq);
        List<String> result3 = freq.keySet().stream().collect(Collectors.toList());
        for (String s : result3) {
            System.out.println(s);
        }
    }

    public static String similar(List<String> stmt) {

        String[] strarray = stmt.toArray(new String[0]);

//        String[] stmt = {"A1", "B", "A", "C", "A", "C", "E", "E", "F", "F"};
        Map<String, Long> freq = Stream.of(strarray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        System.out.println(freq);
        List<String> result3 = freq.keySet().stream().collect(Collectors.toList());
//        for (String s : result3) {
//            System.out.println(s);
//        }

        String result = result3.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(",", "", ""));
        return result;

    }
}
