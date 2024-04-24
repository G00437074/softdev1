import java.util.Scanner;
public class Exxercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // list variables
        int result = 0;

        // inputs required
        System.out.print("Enter result: ");
        result = input.nextInt();

        // if / else, and/or loops
        if(result >= 90){
            System.out.println("A");
        }else if(result >= 70){
            System.out.println("B");
        }else if(result >= 50){
            System.out.println("C");
        }else{
            System.out.println("F");
        }

    }
}