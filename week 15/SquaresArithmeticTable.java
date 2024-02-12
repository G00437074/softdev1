public class SquaresArithmeticTable{
    public static void main(String[] args) {
        int total = 0;
        String div = "--------------";
        System.out.println(div);
        System.out.println("Number Square");
        System.out.println(div);
        
        int i = 1;
        while(i <= 10){
            System.out.println(i + " \t " + (i * i));
            total = total + (i * i);
            i++;
        }
        System.out.println(div);
        System.out.println("Total \t " + total);
        System.out.println(div);
    }
}