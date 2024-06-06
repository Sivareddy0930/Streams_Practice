package Streams.Problems;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LastElementOfAnArray {
    public static void main(String[] args) {
        int arr[] ={9,1,4,6,0,2,3,5,4000,4};
        Arrays.stream(arr).skip(arr.length-1).forEach(System.out::println);
    }
}
