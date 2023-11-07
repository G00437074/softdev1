import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first = 0;
        int second = 0;

        System.out.println("Enter first number: ");
        first = input.nextInt();
        System.out.println("Enter second number: ");
        second = input.nextInt();

        System.out.println(first + " * " + second + " = " + (first * second));

    input.close();

    }
}