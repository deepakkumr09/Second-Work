public class FunctionOverloading {

//Function overlading using parameter.

//     public static int sum(int a, int b){
//         return a+b;
//     }
//     public static int sum(int a, int b,int c){
//         return a + b + c;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(4,4));
//         System.out.println(sum(8,8,8));
//     }
    
// 


// Function Overloading using Data types 
public static int sum(int a, int b){
    return a + b;
}
public static float sum(float a , float b){
    return a + b;
}
public static void main(String[] args) {

    System.out.println(sum(3,4));
    System.out.println(sum(3.4f,4.5f));
    
}

}