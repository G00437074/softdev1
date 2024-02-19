import java.util.Scanner;
public class NamgeAge{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        int age = 0;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();

        for(int i = 1; i <= age; i++){
            System.out.println(i + ". " + name);
        }
    input.close();
    }
}