import java.util.Scanner;
    public class DecimalNumbers{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double x = 0, y = 0;

            System.out.print("Enter a number: ");
            x = input.nextDouble();
            System.out.print("Enter another number: ");
            y = input.nextDouble();

            System.out.printf("Numbers entered were %.1f and %.1f%n", x, y);

        }
}