import java.util.Scanner;
public class Arithmetic1{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0, e = 0;

        System.out.print("Enter a number for a: ");
        a = input.nextInt();
        System.out.print("Enter a number for b: ");
        b = input.nextInt();
        System.out.print("Enter a number for c: ");
        c = input.nextInt();
        System.out.print("Enter a number for d: ");
        d = input.nextInt();
        System.out.print("Enter a number for e: ");
        e = input.nextInt();

        System.out.println("a: " + (a += 9));
        System.out.println("b: " + (b -= 4));
        System.out.println("c: " + (c *= 3));
        System.out.println("d: " + (d /= 2));
        System.out.println("e: " + (e %= 5));

        input.close();

    }
}