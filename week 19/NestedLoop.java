import java.util.Scanner;
public class NestedLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // counter controlled loop
        for(int i = 1; i <=5; i++){
        System.out.println("Line " + i);
        }

        // sentiel loop
        int flag = 0;
        while(flag == 0){
            System.out.print("Run again for (o for yes): ");
            flag = input.nextInt();

        }
        // nexted loop for processing rows/columns
        // row 1: column 1   column 2
        // row 2: column 1   column 2
        //int count = 1;
        for(int i = 1; i <=2; i++){ // outer loop for processing rows
                System.out.print("row " + i + ": ");
                for(int j = 1; j <= 2; j++){
                System.out.print("column " + j + "\t");
                //count++;
            }
            System.out.println();
        }
    }
}
