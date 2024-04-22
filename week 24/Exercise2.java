import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // list variables
        int first = 0;
        int second = 0;

        // inputs required
        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();

        // if / else, and/or loops

        // outputs
        System.out.println(first + " + " + second + " * 4 = " + (first + second * 4));

        // input.close();
    }
}