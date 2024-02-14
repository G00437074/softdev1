public class Loops{
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10){
            System.out.println(i + " . loop. ");
            i++;
        }

        System.out.println();

        for(int count = 1; count <= 3; count++){
            System.out.println(count + " . for loop. ");
        }
    }
}