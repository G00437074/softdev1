import java.util.Scanner;
public class NumberRange{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter a number: ");
        x = input.nextInt();
        
        // exercise 8
        if(x >= 10 && x<= 20){
            System.out.println("In Range");
        }else{
            System.out.println("Not in Range");
        }
        
        // exercise 9
        if(x == 2 || x == 4){
            System.out.println("Valid - 2 or 4 allowed");
        }else{
            System.out.println("Not Valid - must be 2 or 4");
        }

        input.close();
    }
}