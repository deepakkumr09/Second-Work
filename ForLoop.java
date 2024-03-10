//Print a sqaure Pattern
import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter a number ;");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       for(int i = 1; i<=n;i++ )
       {
        for(int j = 1;j<=n;j++)
       {
        System.out.print("* ");
       }
       System.out.println(" ");
       }
    }
    
}
