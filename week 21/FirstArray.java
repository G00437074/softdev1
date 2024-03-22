//import java.util.Scanner;
public class FirstArray{
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        
        // list variables
        int[] x;
        x = new int[4];

        // if / else, and/or loops
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

        // outputs
        System.out.println();
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[2] = 40;

        System.out.println("After assigning values: ");
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println("Output using while loop: ");
        int count = 0;
        while(count < x.length){
            System.out.println(x[count]);
            count++;
        }

        // input.close();
    }
}