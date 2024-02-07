import java.util.Scanner;
public class EightLoop{
    public static void main(String []  args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradecounter = 1;
        int grade = 0;
        int average = 0;

        while(gradecounter <= 5){
            System.out.println("Enter grade: ");
            grade = input.nextInt();
            total = total + grade;
            gradecounter = gradecounter + 1;

        }

        average = total / 5;

        System.out.println("Total of all grades " + total);
        System.out.println("Class average " + average);

    }
}