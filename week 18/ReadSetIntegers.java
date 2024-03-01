import java.util.Scanner;
public class ReadSetIntegers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int flag = 1;
        int odd = 0;
        int even = 0;

        while(flag ==1){
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number%2 ==1){
                odd += number;
            }else{
                even += number;
            }

        System.out.println("Continue (1 for yes): ");
        flag = input.nextInt();

        }

        System.out.println("Odd total: " + odd);
        System.out.println("Even total: " + even);
    }
}
