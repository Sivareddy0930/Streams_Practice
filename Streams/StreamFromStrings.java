package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFromStrings {
    public static void main(String[] args) {
        String s = "java programming";
       List al=Arrays.stream(s.split("")).distinct().toList();
        System.out.println(al);
    }
}
