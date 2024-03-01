import java.util.Scanner;
public class EvenOdds{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // list variables
        int number = 0;
        char again = 'x';

        // inputs required
        do{
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number%2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        System.out.println("Continute (y/n)?: ");
        again = input.next().charAt(0);
        
        // if / else, and/or loops
        }while(again == 'y');
       
        // outputs
        System.out.println("Program ends.");
        
        }

    }