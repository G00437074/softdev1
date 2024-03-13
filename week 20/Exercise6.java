import java.util.Scanner;
public class Exercise6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // list variables
        int number = 0;

        // inputs required
        System.out.println("Enter a number: ");
        number = input.nextInt();

        // if / else, and/or loops
        if(number >= 4 && number <= 8){
            number *= 6;
        }else if(number >= 10 && number <= 14){
            number *= 12;
        }else if(number >= 16 && number <= 20){
            number *= 18;
        }else if(number >= 22 && number <= 26){
            number *= 24;
        }else{
            number *= 3;
        }

        // outputs
        System.out.println("Number updated to: " + number);

        input.close();
    }
}