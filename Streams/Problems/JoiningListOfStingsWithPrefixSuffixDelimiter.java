package Streams.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JoiningListOfStingsWithPrefixSuffixDelimiter {
    public static void main(String[] args) {
        List<String> s= Arrays.asList("okay","fine","apple","cat","flight");
        String c=s.stream().collect(Collectors.joining(","));
        System.out.println(c);

        String c1=s.stream().collect(Collectors.joining(",","#","#"));
        System.out.println(c1);

    }
}
