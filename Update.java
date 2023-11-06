import java.util.Scanner;

public class SubStr{
    public static void main(String[] args) {
        // Exercise 4
        Scanner input = new Scanner(System.in);
        String word = "Software";

        System.out.println("Substring:First 4 characters of " + word + " is " + word.substring(0, 4));

        System.out.println(word.substring(4));
        System.out.println(word.substring(4, 6));

        // Exercise 5

        word = "axtxmn";
        String updateWord = word.replace('x', 'u');
        System.out.println(word + "is updated to " + updateWord);
        System.out.println(word + " is updated to " + word.replace('x', 'u'));

        input.close();

    }
}