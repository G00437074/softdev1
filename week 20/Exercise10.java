import java.util.Scanner;
public class Exercise10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 4; i++){ // outer loop for processing rows
            for(int j = 1; j <= 4; j++){
                System.out.print("r" + i + "c" + j + " ");
            }
            System.out.println();
    }
}
}