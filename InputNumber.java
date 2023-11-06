import java.util.Scanner;

public class InputNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("Number entered was " + number);

        input.close();
        
    }

}
