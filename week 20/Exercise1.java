import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;

        // part a.
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        //part b.
        result = (num1* 2) + (num2 * 4) + (num3 * 8);
        System.out.println("(" + num1 + " * 2) + (" + num2 + " * 4) + (" + num3 + " * 8) = " + result);

    }
}