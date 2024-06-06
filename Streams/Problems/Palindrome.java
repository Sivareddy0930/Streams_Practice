package Streams.Problems;

import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        String s="ABBA";
       String revString = s.chars().mapToObj(value->(char)value)
               .collect(Collectors.collectingAndThen(Collectors.toList(),
               list -> {
            StringBuilder sb=new StringBuilder();
            for (int i =list.size()-1 ; i >= 0 ; i--) {
                sb.append(list.get(i));
            }
            return sb.reverse().toString();
        }
        ));


       if(revString==s){
           System.out.println("palindrome");
       }
       else{
           System.out.println("not a palindrome....");
       }
    }
}
