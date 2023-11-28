import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if((number % 2) == 0){
            System.out.println("Number is even");
        }

        if((number % 2) != 0){
            System.out.println("Number is odd");
        }
        
        input.close();
    }
}