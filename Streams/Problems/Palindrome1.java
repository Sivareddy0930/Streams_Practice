package Streams.Problems;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome1 {
    public static void main(String[] args) {
        String s="AABBBAA";
        boolean b=IntStream.range(0,s.length()/2).allMatch(i->s.charAt(i) == s.charAt(s.length()-i-1));
        System.out.println(b);
    }
}
