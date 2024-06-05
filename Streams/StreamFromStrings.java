package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromStrings {
    public static void main(String[] args) {
        String s = "java programming";
       List al=Arrays.stream(s.split("")).distinct().toList();
        System.out.println(al);
//==================================================================================
        List<Character> sl=s.chars()
                .mapToObj(value->(char)value)
                .collect(Collectors.toList());
        System.out.println(sl);
//==================================================================================
       Stream<String> sp= Pattern.compile("").splitAsStream(s);
       List<String> s1 = sp.collect(Collectors.toList());
        System.out.println(s1);

    }
}
