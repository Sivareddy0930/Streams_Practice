package Streams.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfAString {
    public static void main(String[] args) {

        String s1="Mother In Law bro";
       List<String> l= Pattern.compile(" ").splitAsStream(s1).map(value->new StringBuffer(value).reverse().toString()).collect(Collectors.toList());
        System.out.println(l);

       List<String> l1 = Arrays.stream(s1.split(" ")).map(value->new StringBuffer(value).reverse().toString()).collect(Collectors.toList());
        System.out.println(l1);
    }
}
