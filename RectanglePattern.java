import java.util.Scanner;
public class RectanglePattern{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row = 0;
        int column = 0;

        System.out.print("Enter number of rows: ");
        row = input.nextInt();
        System.out.print("Enter number of columns: ");
        column = input.nextInt();

        for(int rows = 1; rows <= row; rows++){
            for(int columns = 1; columns <= column; columns++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}