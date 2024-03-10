public class DecimaltoBinary {
    public static void DectoBin(int decimal){
    int pow = 0;
    int bin_num = 0;
    while(decimal >0){
        int lastdigit = decimal%10;
        bin_num =  bin_num + (lastdigit*(int)Math.pow(10,pow));
            pow++;
            decimal = decimal/2;
    }
    System.out.println("Binary number is = "+bin_num);
    
    }
    public static void main(String[] args) {
        DectoBin(7 );
        public class DecimaltoBinary {
    public static void DectoBin(int decimal){
    int pow = 0;


    
    int bin_num = 0;
    while(decimal >0){
        int lastdigit = decimal%10;
        bin_num =  bin_num + (lastdigit*(int)Math.pow(10,pow));
            pow++;
            decimal = decimal/2;
    }
    System.out.println("Binary number is = "+bin_num);
    
    }
    public static void main(String[] args) {
        DectoBin(7 );
       


        }
    
    
}

       


        }
    
    
}
