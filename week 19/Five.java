public class Five{
    public static void main(String[] args){
        for(int x = 1; x <=50; x++){
        if(x % 5 == 0){
            if( x != 50){
            System.out.print(x + ", "); 
        }else{
             System.out.print(x);
        }
        }
    }
        System.out.println();
    }
}