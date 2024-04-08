public class SeventhArray{
    public static void main(String[] args){
        int[] x = {23 , 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int[] y = new int[10];

        int index = 0;
        for(int i = x.length - 1; i >= 0; i--){
            y[index++] = x[i];
        }

        System.out.println("Index\tBefore\tAfter");
        System.out.println("-----\t------\t-----");

        for(int i = 0; i < y.length; i++){
            System.out.println(i + "\t" + x[i] + "\t" + y[i]);
        }
        System.out.println();
    }
}