import java.util.Scanner;
public class Names{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];

        System.out.print("Enter first name: ");
        names[0] = input.nextLine();
        System.out.print("Enter second name: ");
        names[1] = input.nextLine();
        System.out.print("Enter third name: ");
        names[2] = input.nextLine();
        System.out.println();
        System.out.println("Names");
        System.out.println("-----");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


    }
}