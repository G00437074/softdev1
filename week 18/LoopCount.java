import java.util.Scanner;
public class LoopCount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // list variables
        int flag = 0;
        int total = 0;

        // inputs required
        System.out.print("Want to loop: (0 for yes, 1 for no): ");
        flag = input.nextInt();

        // if / else, and/or loops
        while(flag == 0){
            total++;
            System.out.print("Loop again: (0 for yes, 1 for no): ");
            flag = input.nextInt();
        }
       
        // outputs
        System.out.println("You looped " + total + " times.");
        
        }

    }
