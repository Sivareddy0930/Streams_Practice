package Streams.Problems;


import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayInToSingleSortedArray {
    public static void main(String[] args) {
        int[] arr1={9,1,4,6,0,2,3,5,8};
        int[] arr2={7,3,5,8,4,6,0};
        int[] newArr = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();

        System.out.println(Arrays.toString(newArr));

//        MergeTwoUnsortedArrayInToSingleSortedArrayBy remove duplicates.

        int[] newArr1 = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(newArr1));



    }
}
