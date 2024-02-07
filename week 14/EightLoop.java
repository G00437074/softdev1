import java.util.Scanner;
public class EightLoop{
    public static void main(String []  args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int number = 0;

        System.out.println("Enter a number: ");
        number = input.nextInt();
        while(x <=5){
            System.out.println(x + " times " + number + " = " + (number * x));
            x++;
        }

    }
}