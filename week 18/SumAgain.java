import java.util.Scanner;
public class SumAgain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int flag = 1;

        while(flag == 1){
            System.out.print("Enter the first number: ");
            num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            num2 = input.nextInt();
            System.out.println("Total: " + (num1 + num2));
        	System.out.print("Again (1 for yes): ");
            flag = input.nextInt();
        }
    }
}