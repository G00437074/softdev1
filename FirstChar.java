import java.util.Scanner;

public class FirstChar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        System.out.print("Enter a word: ");
        word = input.next();

        System.out.println("First character of " + word + " is: " + word.charAt(0));

        int x = "test again".length();
        System.out.println(x);
        
        input.close();

    }
}