package Streams.Problems;


import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElementOfAnArray {
    public static void main(String[] args) {
        int arr[] ={9,1,4,6,0,2,3,5,4000,4,4,6,0,2,3,1004};
//        Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
//Error because of IntStream class sorted() dont take any perimeters like Comparator.reverseOrder()
        Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

    }
}
