import java.util.Scanner;
public class Last{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        int number = 0;

        System.out.print("Enter a word: ");
        word = input.next();

        number = word.length();
        number--;
        System.out.println("Last character of " + word + " is: " + word.charAt(number));

        input.close();
        
    }

}
