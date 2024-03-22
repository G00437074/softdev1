public class SecondArray{
    public static void main(String[] args) {
        int[] x = {128, 132, 8, 15, 18};
        System.out.println("Index\tValues");
        System.out.println("------\t------");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
    }
}