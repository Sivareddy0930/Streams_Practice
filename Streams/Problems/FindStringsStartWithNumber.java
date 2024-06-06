package Streams.Problems;

import java.util.Arrays;
import java.util.List;

public class FindStringsStartWithNumber {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Siva","8okay","king","4String");
        list.stream().filter(str ->Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
