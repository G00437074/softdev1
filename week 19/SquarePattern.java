import java.util.Scanner;
public class SquarePattern{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = 0;

        System.out.print("Enter size: ");
        size = input.nextInt();
        for(int rows = 1; rows <= size; rows++){
            for(int columns = 1; columns <= size; columns++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}