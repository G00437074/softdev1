public class TwoD_Array{
    public static void main(String[] args){
        int[][] x = {{1, 2, 10, 11}, {3, 4, 5}};
        for(int outer = 0; outer < x.length; outer++){
            for(int inner = 0; inner < x[outer].length; inner++){
                System.out.println(x[outer][inner]);
            }
        }
        System.out.print(x[0][0] + ", ");
        System.out.print(x[0][1] + ", ");
        System.out.print(x[0][2] + ", ");
        System.out.print(x[0][3] + ", ");
        System.out.print(x[1][0] + ", ");
        System.out.print(x[1][1] + ", ");
        System.out.println(x[1][2]);
        
    }
}