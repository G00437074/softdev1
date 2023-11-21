import java.util.Scanner;
public class Monday{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 0;

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();

        if(first == second){
            System.out.println(first + " == " + second);
        }

    	if(first != second){
            System.out.println(first + " != " + second);
        }

        if(first > second){
            System.out.printf("%d > %d%n", first, second);
        }

        if(first < second){
            System.out.printf("%d < %d%n", first, second);
        }
        if(first >= second){
            System.out.printf("%d >= %d%n", first, second);
        }

        if(first <= second){
            System.out.printf("%d <= %d%n", first, second);
        }

        input.close();
    }
}