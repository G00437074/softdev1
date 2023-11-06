import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String word;

        System.out.println("==============");
        System.out.println("Requirement 1:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a word: ");
        word = input.next();

        System.out.println("Number of characters in "+word+" is: "+word.length());

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 2:");
        System.out.println("==============");
        System.out.println();

        System.out.println("First character of " + word + " is: " + word.charAt(0));
        int position = word.length() -1;
        System.out.println("Last character of " + word + " is: " + word.charAt(position));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 3:");
        System.out.println("==============");
        System.out.println();

        System.out.println("Second character " + word.charAt(1) + " is found at position " + word.indexOf(word.charAt(1)));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 4:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a sinlge character: ");
        char letter = input.next().charAt(0);
        System.out.println(letter + " exists at position " + word.indexOf(letter));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 5:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter first name: ");
        String firstname = input.next();
        System.out.print("Enter last name: ");
        String lastname = input.next();

        System.out.println("Full name: " + firstname + " " + lastname);
        System.out.println("Full name: " + firstname.concat(" ").concat(lastname));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 6:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter first string: ");
        String first = input.next();
        System.out.print("Enter last string: ");
        String second = input.next();

        System.out.println(first + " and " + second + " match: " + first.equals(second)); 
        System.out.println(first + " and " + second + " match: " + first.equalsIgnoreCase(second));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 7:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a string: ");
        first = input.next();

        System.out.println("First 3 characters of " + first + " are " + first.substring(0, 3));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 8:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a string: ");
        first = input.next();

        System.out.println(first + " update to " + first.replace('x', 'u'));

        input.close();
    }
}
