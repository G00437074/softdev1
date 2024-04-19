import java.util.Scanner;
public class InstanceMethods{
    public static void main(String[] args) {
        InstanceMethods im = new InstanceMethods();
        Scanner input = new Scanner(System.in);
        String firstname = "";
        String secondname = "";
        im.method1();
        im.method2();
        im.method3(4);
        im.method4(25, 50);
        im.method5(10, 20, 30);
        im.method6("Adam", "Devlin");
        
        //part g.
        System.out.print("Enter first name: ");
        firstname = input.next();
        System.out.print("Enter second name: ");
        secondname = input.next();
        im.method6(firstname, secondname);
        im.method7("Adam", 13);

        int x = im.method8();
        System.out.println("method8: " + x);

        String name = im.method9(firstname, secondname);
        System.out.println("method9: " + name);

        int result = im.method10(10, 20, 40);
        System.out.println("method10: " + result); 

    } // end main

    // part a. - no input or output
    void method1(){
        System.out.println("Hello from method1");
    }
    // part b. - no input or output
    void method2(){
        System.out.println("Hello from method2");
    }
    // part c. - input a single value, no output
    void method3(int x){
        System.out.println("You passed me, method3, an integar value of " + x);
    }
    // part d. - input two values, no output
    void method4(int x, int y){
        System.out.println("You passed me, method4, integar values of: " + x + " and " + y);
    }
    // part e. - input three values, no output
    void method5(int x, int y, int w){
        System.out.println("You passed me, method5, integar values of: " + x + ", " + y + " and " + w);
    }
    // part f./g. - input, no output
    void method6(String x, String y){
        System.out.println("You passed me, method6, the name: " + x + " " + y);
    }
    // part h. - input two values, no output
    void method7(String x, int y){
        System.out.println("You passed me, method7, the name " + x + " and the number " + y);
    }
    // part i. - no input, integar output
    int method8(){
        return 1000;
    }
    // part j.
    String method9(String x, String y){
        return x + " " + y;
    }
    // part k. - input three values, integar output
    int method10(int x, int y, int z){
        int result = x + y + z;
        return result;
    }



} // end class