import java.util.Scanner;
    public class WholeNumbers{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int x = 0, y = 0;

            System.out.print("Enter a number: ");
            x = input.nextInt();
            System.out.print("Enter another number: ");
            y = input.nextInt();

            System.out.printf("Numbers entered were %d and %d%n", x, y);

        }
}
