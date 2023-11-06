import java.util.Scanner;

public class SubStr{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "Software";

        System.out.println("Substring:First 4 characters of " + word + " is " + word.substring(0, 4));

        System.out.println(word.substring(4));
        System.out.println(word.substring(4, 6));

        input.close();

    }
}