import java.util.Scanner;
public class Password{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pw = "";
        int total = 0;
        boolean access = true;

        do{
            System.out.print("Enter password: ");
            pw = input.next();
            total++;
            access = pw.matches("mypass");
        }while(!access && total < 3);

        System.out.println(total);
        if(access){
            System.out.println("Access granted!");
        }else{
            System.out.println("Access denied!");
        }

        }

    }