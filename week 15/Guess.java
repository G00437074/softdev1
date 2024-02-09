import java.util.Scanner;
public class Guess{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        while(number != 50){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number != 50){
                if (number > 50){
                    System.out.println("Guess again: go lower");
                }else{
                    System.out.println("Guess again: go higher");
                }
            }
        }
        System.out.println("Game over");
        input.close();
    }
}