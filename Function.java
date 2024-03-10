import java.util.*;
public class Function {
    public static void printHelloWorld(){
        System.out.println("Hello World ");
    }
    public static int Add(int x,int y)
    {
       
        int sum = x+y;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        printHelloWorld();
        int chutiya = Add(2,3);
        
    }
    
}
