import java.util.Scanner;
public class Guess1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 10;
        int guess = 0;
        int count = 0;
        boolean flag = true;

        while(flag){
            count++;
            System.out.println("Guess the number: ");
            guess = input.nextInt();
                if(guess == number)
                flag = false;
        }
        System.out.print("Good guess. The number is " + number + ". It took you " + count);
        if(count == 1){
            System.out.println(" guess.");
        }else{
            System.out.println(" guesses.");
        }
    }
}