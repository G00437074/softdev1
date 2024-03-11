import java.util.Scanner;
public class Program{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // list variables
        int number = 0;

        // inputs required
        System.out.print("Enter number: ");
        number = input.nextInt();

        // if / else, and/or loops
        if(number != 10){
            System.out.println("Number entered is not equal to 10");
        }else{
            System.out.println("Number entered is not equal to 10");
        }

        // outputs

        input.close();
    }
}