import java.util.Scanner;
public class EigthArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] x = {23 , 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int[] y = new int[x.length - 1];

        System.out.print("Enter a numbe to remove: ");
        int number = input.nextInt();
        boolean found = false;
        for(int i = 0; i < x.length; i++){
            if(number == x[i]){
                found = true;
            }
        }
    }
}