package Streams.Problems;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagaram {
    public static void main(String[] args) {
//        String s1="Keep";
//        String s2="Peek";
        String s1="Mother In Law";
        String s2="Hitler Woman";

        s1=s1.replaceAll(" ","");
        s2=s2.replaceAll(" ","");

        String ns= Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining(""));
        System.out.println(ns);

        String ns1= Stream.of(s2.split("")).map(value->value.toUpperCase()).sorted().collect(Collectors.joining(""));
        System.out.println(ns1);

        if (ns.equals(ns1)) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }

    }
}
