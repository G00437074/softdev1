import java.util.Scanner;
public class Size{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a size: ");
        number = input.nextInt();

        if(number > 70 && number <= 100){
            System.out.println("Go for larger size");
        }else if (number > 35 && number <= 70){
            System.out.println("Go for a medium size");
        }else if(number >= 10 && number <= 35){
            System.out.println("Go for a small size");
        }else{
            System.out.println("Size is not available");
        }
        
    }
}