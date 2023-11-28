import java.util.Scanner;
public class Capital{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.println("What is the capital of Ireland?");

        System.out.println("1. Madrid");
        System.out.println("2. Paris");
        System.out.println("3. Dublin");
        System.out.println("4. Berlin");

        System.out.print("Enter  number for your answer: ");
        x = input.nextInt();

        switch(x){
            case 1:
                System.out.println("Incorrect");
                break;
            case 2:
                System.out.println("Incorrect");
                break;
            case 3:
                System.out.println("Correct");
                break;
            case 4:
                System.out.println("Incorrect");
                break;
            default:
                System.out.println("Invalid answer - must be 1, 2. 3 or 4");
        }

        input.close();

    }
}