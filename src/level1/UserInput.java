package level1;

import java.util.Scanner;
import java.util.stream.Stream;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by space:");
        String input = sc.nextLine();

        Stream.of(input.split("\\s+"))
                .map(Integer::parseInt)  // Lambda shorthand for parsing integers
                .forEach(num -> System.out.println("Number: " + num));

        System.out.println("Input first number : ");
        int num1 = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Input second number : ");
        int num2 = Integer.parseInt(sc.nextLine().trim());

        System.out.println(num1 + num2);

        sc.close();
    }
}
