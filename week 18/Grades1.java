import java.util.Scanner;
public class Grades1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        double total = 0;
        int grades = 10;
        int counter = 1;


        while(counter <= grades){
            System.out.print("Enter grade " + counter + ": ");
            result = input.nextInt();
            total = total + result;
            counter++;
        }

        System.out.println("Average grade " + (total / grades));
        input.close();

        }

    }