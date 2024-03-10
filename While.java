//First n natural number
import java.util.*;
public class While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int count = 1;
        while(count<=n)
        {
            System.out.print(count+"  ");
            count++;
        }
    }
}