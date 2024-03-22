import java.util.Scanner;
public class FithArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[8];
        int total = 0;
        for(int i = 0; i < x.length; i++){
            System.out.print("Enter value for element " + (i + 1) + ": ");
            x[i] = input.nextInt();
            total += x[i];
        }
        System.out.println("Average of array values: " + (total * 1.0 / x.length));
        input.close();
    }
}