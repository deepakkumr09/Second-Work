public class CallByValueMultyply{
    public static int Multiply(int a , int b){
        int product = a*b;
        return product;


    }
    public static void main(String[] args) {
        int a ;
        int b ;
        int prod = Multiply(4,4);
        System.out.println(prod);
        prod = Multiply(100, 34);
        System.out.println(prod);

    }
}