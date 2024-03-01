import java.util.Scanner;
public class CountNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int flag = 1;
        int positive = 0;
        int negative = 0;
        int zero  = 0;

        while(flag == 1){
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number == 0){
                zero++;
            }else if(number > 0){
                positive++;
            }else{
                negative++;
            }

        System.out.println("Continue (1 for yes): ");
        flag = input.nextInt();

        }

        System.out.println("Negative numbers: " + negative);
        System.out.println("Positive numbers: " + positive);
        System.out.println("Zero numbers: " + zero);
    }
}
