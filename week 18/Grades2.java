import java.util.Scanner;
public class Grades2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        double total = 0;
        int flag = 0;
        int counter = 0;

        while(flag != -1){
            counter++;
            System.out.print("Enter grade " + counter + " (-1 to quit): ");
            flag = input.nextInt();
            if(flag != -1){
                total += flag;
            }
        }
        counter--;
        System.out.println("Average grade is " + (total / counter));
        input.close();

        }

    }