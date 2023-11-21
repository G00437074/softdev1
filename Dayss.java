import java.util.Scanner;
public class Sign{
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(number < 1){
            System.out.println("Number must be from 1 to 7");
        }

        if(number > 7){
            System.out.println("Number must be from 1 to 7");
        }

        if(number == 1){
            System.out.println("Monday");
        }

        if(number == 2){
            System.out.println("Tuesday");
        }

        if(number == 3){
            System.out.println("Wednesday");
        }

        if(number == 4){
            System.out.println("Thursday");
        }

        if(number == 5){
            System.out.println("Friday");
        }

        if(number == 6){
            System.out.println("Saturday");
        }

        if(number == 7){
            System.out.println("Sunday");
        }

        input.close();

    }
}