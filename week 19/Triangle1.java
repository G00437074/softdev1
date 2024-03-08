public class Triangle1{
    public static void main(String[] args){
        System.out.println("Triangle 1:\n");
        for(int outer = 1; outer <= 8; outer++) {
            for(int inner = 1; inner <= outer; inner++) {
            System.out.print("+");
        }
        System.out.println("");
    }
    System.out.println("Triangle 2:\n");
        for(int outer = 8; outer >= 1; outer--) {
            for(int inner = 1; inner <= outer; inner++) {
            System.out.print("+");
        }
        System.out.println("");


    }
}
}