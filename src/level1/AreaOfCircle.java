package level1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide radius: ");
        int radius = sc.nextInt();
        System.out.println(Math.PI * radius * radius);
    }
}
//O(n)