import java.util.Scanner;
public class EvenOdds{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if((number %= 2) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        input.close();

    }
}