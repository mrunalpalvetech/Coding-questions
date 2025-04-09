package StringManipulation;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
* In given string array find string lenght and it's count.*/
public class FindLengthAndCount {
    public static void main(String[] args) {
        groupByLength(new String[]{"apple", "orange", "Chiku", "ABC"});
    }
    private static void groupByLength(String[] sampleStr){
        Map<Integer, Long> counterMap = new HashMap<>();
        counterMap = Arrays.stream(sampleStr)
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.counting()
                ));
        counterMap.forEach((length, count) -> {
            System.out.println("String length = " + length + " count = " + count);
        });
    }
}
//TimeComplexity = O(n)