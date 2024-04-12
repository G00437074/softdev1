import java.util.Scanner;
public class CreateArray{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int values = 0;

        System.out.print("Enter 1 for int array, 2 for double array: ");
        choice = input.nextInt();
        System.out.print("How many values to store in array: ");
        values = input.nextInt();

        if(choice == 1){
            // int array
            int[] numbers = new int[values];
            for(int i = 0; i < numbers.length; i++){
                System.out.print("Enter value " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }
            System.out.println("\nValues in array:\n");
            for(int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i] + ". ");
            }
            System.out.print(numbers(numbers.length - 1));
            System.out.println();
        }else if(choice == 2){
            // double array
            double[] numbers = new double[values];
        }else{
            //invalid choice
            System.out.println("Invalid choice.");
        }

    }
}