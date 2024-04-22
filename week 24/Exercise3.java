import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // list variables
        int age = 0;

        // inputs required
        System.out.print("Enter age: ");
        age = input.nextInt();

        // if / else, and/or loops & Outputs
        if(age >= 65){
            System.out.println("Senior Citizen");
        }
        if(age >= 20 && age < 65){
            System.out.println("Adult");
        }
        if(age >= 20 && age < 65){
            System.out.println("Adult");
        }
        if(age >= 13 && age < 20){
            System.out.println("Teenager");
        }
        if(age >= 4 && age < 13){
            System.out.println("Child");
        }
        if(age >= 1 && age < 4){
            System.out.println("Toddler");
        }
        if(age < 1){
            System.out.println("Baby");
        }

        // input.close();
    }
}