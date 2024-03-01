import java.util.Scanner;
public class ZeroFifty{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // list variables
        int number = 0;

        // inputs required
        do{
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // if / else, and/or loops
        }while(number >= 0 && number <= 50);
       
        // outputs
        System.out.println("Program ends.");
        
        }

    }