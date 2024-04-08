public class Arrays{
    public static void main(String[] args){
        int[] x = {10, 20, 30, 40, 50};

        System.out.println("First value in array x: " + x[0]);
        System.out.println("Last value in array x: " + x[4]);
        System.out.println("First value in array x: " + x[x.length - 1]);

        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}