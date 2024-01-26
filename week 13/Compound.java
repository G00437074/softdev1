import java.util.Scanner;
public class Compounds{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        number += 2; 
        System.out.println("Number updated to: " + number);

        number -= 5; 
        System.out.println("Number updated to: " + number);

    input.close();
    }
}