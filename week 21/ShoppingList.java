import java.util.Scanner;
public class ShoppingList{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = 0;
        System.out.print("How many items for your list: ");
        number = input.nextInt();

        String[] list = new String[number];

        for(int i = 0; i < list.length; i++){
            System.out.print("Enter item " + (i + 1) + ": ");
            list[i] = input.next();
        }
        System.out.println("Shopping List: ");
        for(int i = 0; i < list.length; i++){
                System.out.println((i+1) + ". " + list[i]);
        }

    }
}