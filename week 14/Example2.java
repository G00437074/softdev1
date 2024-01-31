// Example 1 rewritten using a loop
import java.util.Scanner;
public class Example2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int count = 1; // 1. Initialiser
        while(count <= 4){ // 2. Condition 
            // 3. Code
            System.out.println("Enter a number: "); 
            a += input.nextInt();
            count++; // 4. Incrementor
        }

        System.out.println("Sum of numbers is: " + a);
        input.close();

    }
}