package level1;

import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeapYear {
    public static void main(String[] args) {
        Predicate<Integer> isLeap = year -> (year % 4 == 0 && year % 100 != 0) || year % 400 ==0;
        System.out.println(isLeap.test(2700) ? "Leap year" : "Not a leap year");

        System.out.println("Count of leap years in century: " + IntStream.range(3000, 3999)
                .filter(isLeap::test)
                .count());

    }
}
//TC- O(1)
