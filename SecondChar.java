import java.util.Scanner;

public class SecondChar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        System.out.print("Enter a word: ");
        word = input.next();

        System.out.println("Second character of " + word + " is: " + word.charAt(1));
        
        input.close();

    }
}