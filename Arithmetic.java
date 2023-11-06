import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int result = 0;

        System.out.println("Enter first number: ");
        x = input.nextInt();
        System.out.println("Enter second number: ");
        y = input.nextInt();

       /*String a = "2";
        String b = "4";
        System.out.println("Result: " + (a + b));
        */

        result =  x + y;
        System.out.println("Result of addition is: " + result);

        result = x - y;
        System.out.println("Result of subtraction is: " + result);

        input.close();

        double first = 2.34578;
        double second = 12.48464;
        double product = first * second;

        System.out.println("Decimal number result: " + product);
        product = Math.round(product);
        System.out.println("Decimal number result: " + product);
        product = first * second;
        product = Math.round(product * 10.0) / 10.0;
        System.out.println("Decimal number rounded to 1 decimal place: " + product);
        product = first * second;
        product = Math.round(product * 100.0) / 100.0;
        System.out.println("Decimal number rounded to 2 decimal place: " + product);
        product = first * second;
        product = Math.round(product * 1000.0) / 1000.0;
        System.out.println("Decimal number rounded to 3 decimal place: " + product);


    }
}