public class NinthArray{
    public static void main(String[] args){
        int[] first = {1,2,3,4};
        int[] second = {1,2,3,4};
        int[] third = {1,2,67,4};

        boolean match12 = true;
        boolean match13 = true;

        for(int i = 0; i < first.length; i++){
            if(first[i] != second[i]){
                match12 = false;
            }
            if(first[i] != third[i]){
                match13 = false;
            }
        }
        if(match12){
            System.out.println("First and second arrays match");
        }else{
            System.out.println("First and second arrays don't match");
        }
        if(match13){
            System.out.println("First and third arrays match");
        }else{
            System.out.println("First and third arrays don't match");
        }
    }
}