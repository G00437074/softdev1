public class Exercise4{
  public static void main(String[] args) {
    int n = 3; // number of rows
    
    for (int i = 0; i < n; i++) {
        
        // Print spaces
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        
        // Print numbers
        for (int k = n - i; k <= n; k++) {
            System.out.print(k * 3 + " ");
        }
        
        System.out.println();
    }
}
}