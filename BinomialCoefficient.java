import java.util.*;

public class BinomialCoefficient {
    public static int fact(int n, int r){
        int n_fact = 1;
        int r_fact = 1;
        int nmr_fact = 1;
        for(int i = 1;i<=n;i++){
            n_fact = n_fact * i;
        }
        for(int i = 1;i<=r;i++){
            r_fact = r_fact * i;
        }
        for(int i = 1;i<=n-r;i++){
            nmr_fact = nmr_fact * i;
        }
        int ncr = n_fact/(r_fact*nmr_fact);
        return ncr;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        System.out.println(fact(n,r));
    }
}
