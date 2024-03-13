import java.util.Scanner;
public class Exercise9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){ // outer loop for processing rows
                System.out.print(i + ": " );
                for(int j = 8; j >= 2; j -= 2){
                System.out.print(j);
                    if(j != 2){
                        System.out.print(", ");
                    }
            }
            System.out.println();
    }
}
}