public class ThirdArray{
    public static void main(String[] args) {
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = i +1;
        }
        System.out.println("-----\t\t-----");
        System.out.println("Index\t\tValues");
        System.out.println("-----\t\t-----");
        for(int i = 0; i < array.length; i++){
            System.out.println(i + "\t\t" + array[i]);
        }
    }
}