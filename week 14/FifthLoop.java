import java.util.Scanner;
public class FifthLoop{
    public static void main(String []  args) {
        Scanner input = new Scanner(System.in);
        int x = 0, count = 1;

        System.out.print("Enter a number: ");
        x = input.nextInt();

        while(count <= x){
            System.out.println("Loop counter: " + count);
            count++;
        }
    }
}