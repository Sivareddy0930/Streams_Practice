package Streams.Problems;

import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {
        String s="Java Programming";
       Map<String,Long> dist =  Pattern.compile("").splitAsStream(s)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(dist);

        Map<Character,Long> dist1 =  s.chars().mapToObj(value -> (char)value)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(dist1);
    }
}
