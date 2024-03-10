import java.util.*;
public class PrimeCheck {
    public static boolean Isprime(int n){
        boolean Isprime = true;
        for(int i = 1; i <= n-1 ; i++)
        {
            if(n%i == 0){
                Isprime = false;
                System.out.println(n+ " is not a prime number ");
                break;
            }
        }
       
        return Isprime;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        
        System.out.println(Isprime(n));
    }
}
