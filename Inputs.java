import java.util.Scanner;

public class Inputs{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "";
        int x = 0;
        double y = 0;

        System.out.print("Enter your first name: ");
        name = input.next();

        System.out.print("Enter a whole number: ");
        x = input.nextInt();

        System.out.print("Enter a decimal number: ");
        y = input.nextDouble();

        System.out.println(name + ", you entered the number " + x + " and " + y + ".");

        input.close();

    }
}