public class Exercise5{
    public static void main(String[] args) {
        
        // list variables
        int[] x = {100, 200, 300, 400};
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");

        // if / else, and/or loops
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
        System.out.println();
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");

        // if / else, and/or loops
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * 3;
            System.out.println(i + "\t" + x[i]);
        }

    }
}