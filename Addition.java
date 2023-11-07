import java.util.Scanner;

public class Addition{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first = 0;
        int second = 0;

        System.out.println("Enter first integer: ");
        first = input.nextInt();
        System.out.println("Enter second integer: ");
        second = input.nextInt();

        System.out.println(first + " + " + second + " = " + (first +second));

    input.close();

    }
}