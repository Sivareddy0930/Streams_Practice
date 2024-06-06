package Streams.Problems;

import java.util.stream.Stream;

public class SumOfAllDigitsOfANumber {
    public static void main(String[] args) {
        int num=1234;
        Integer[] arr={1,2,3,4};
        int sum = Stream.of((""+num).split("")).mapToInt(value -> Integer.valueOf(value)).sum();
        System.out.println(sum);
//=================================================================================================================

        int sum1=String.valueOf(num).chars().map(Character::getNumericValue).sum();
        System.out.println(sum1);

    }
}
