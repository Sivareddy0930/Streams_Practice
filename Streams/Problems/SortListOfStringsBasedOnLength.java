package Streams.Problems;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStringsBasedOnLength {
    public static void main(String[] args) {
        List<String> str =Arrays.asList("apple","car","java programming","java","kingu","kalki1234");
//        List<String> str1 = str.stream().sorted(Comparator.comparing((String value)-> value.length())).collect(Collectors.toList());
        List<String> str1 = str.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

        System.out.println(str1);

    }
}
