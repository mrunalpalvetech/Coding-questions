package level1;

import java.util.function.IntPredicate;

public class EvenOddNumber {
    public static void main(String[] args) {
        IntPredicate isEven = n -> n%2 == 0;
        System.out.println(isEven.test(5) ? "Even" : "Odd");
    }
}
//TC: O(1)
