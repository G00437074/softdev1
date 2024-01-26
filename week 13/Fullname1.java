import java.util.Scanner;
public class Fullname1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = "";
        String last = "";

        System.out.print("Enter your first name: ");
        first = input.next();

        System.out.print("Enter your second name: ");
        last = input.next();

        System.out.println(first.concat(" ").concat(last));

        input.close();
        
    }

}
