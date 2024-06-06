package Streams.Problems;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        int arr1[] ={9,1,4,6,0,2,3,1004,4,6,0,2};
        Set<Integer> set=new HashSet<>();
//        Arrays.stream(arr1).filter(value-> !set.add(value)).forEach(System.out::println);

       Set<Integer> duplicates = Arrays.stream(arr1).filter(value-> !set.add(value)).boxed().collect(Collectors.toSet());
        System.out.println(duplicates);


    }
}
