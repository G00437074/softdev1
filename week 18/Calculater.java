import java.util.Scanner;
public class Calculater{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int flag = 0;

        while(flag != -1){
            System.out.print("Enter number (-1 to quit): ");
            flag = input.nextInt();
            total += flag;

        }
        System.out.println("Total: " + ++total);
        input.close();

        }

    }