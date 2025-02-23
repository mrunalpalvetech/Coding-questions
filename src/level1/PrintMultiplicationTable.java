package level1;

import java.util.stream.IntStream;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        printTable(9);
    }
    private static void printTable(int num) {
//        for(var i = 1; i <= 10; i++) {
//            System.out.println(num * i );
//        }

        IntStream.range(1, 10)
                .map(n -> n * num)
                .forEach(System.out::println);
    }
}
//O(n)