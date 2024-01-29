import java.util.Scanner;

public class Example1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Enter a number: ");
        a = input.nextInt();
        System.out.println("Enter a number: ");
        b = input.nextInt();
        System.out.println("Enter a number: ");
        c = input.nextInt();
        System.out.println("Enter a number: ");
        d = input.nextInt();

        System.out.println("Sum of numbers is: " + (a + b + c +d));
        input.close();

    }
}
