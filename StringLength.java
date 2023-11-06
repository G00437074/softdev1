import java.util.Scanner;

public class StringLength{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        System.out.print("Enter a word: ");
        word = input.next();

        System.out.println(word + " contains " + word.length() + " characters.");

        input.close();

    }
}