import java.util.Scanner;

public class ScannerExample{
    public static void main(String[] args) {
            String s = "Hello there";
            Scanner keyboard = new Scanner(s);
            System.out.println(keyboard.next());

            s = "Hello again";

            Scanner kb = new Scanner(s);
            System.out.println(kb.nextLine());

            s = "First Line\n Second Line";
            Scanner input1 = new Scanner(s);
            System.out.println(input1.nextLine());
            System.out.println(input1.hasNextLine());
            System.out.println(input1.nextLine());
            System.out.println(input1.hasNextLine());

            s = "Hello There";
            Scanner input2 = new Scanner(s);
            System.out.println(input2.hasNext());
            System.out.println(input2.next());
            System.out.println(input2.hasNext());
            System.out.println(input2.next());
            System.out.println(input2.hasNext());

            s = "First Name Last Name";
            Scanner input3 = new Scanner(s);
            System.out.println(input3.next() + " " + input3.next());

            s = "First NamexLast Namex";
            Scanner input4 = new Scanner(s);
            input4.useDelimiter("x");
            System.out.println(input4.next() + " " + input4.next());

    }
}