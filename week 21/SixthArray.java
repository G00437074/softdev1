import java.util.Scanner;
public class SixthArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 89, 99, 10};
        int value = 0;
        int exist = 0;
        
        System.out.print("Enter a value: ");
        value = input.nextInt();

        for(int i = 0; i < x.length; i++){
            if(x[i] == value){
                System.out.println("Nunmber found at index " + i);
                exist = 1;
                break;
            }
        }
        if(exist == 0){
            System.out.println("Value not found");
        }
        input.close();
    }
}