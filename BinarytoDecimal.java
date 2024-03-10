// import java.util.*;

public class BinarytoDecimal {

    public static void Bintodec(int bin_num){
        int pow = 0;
        int decimal = 0;
        while(bin_num>0){
            int lastdigit = bin_num%10;
            decimal = decimal + (int)(lastdigit * Math.pow(2,pow));
            pow++;
            bin_num = bin_num/10;

        }
        System.out.println("Decimal is "+decimal);
    }
    public static void main(String[] args) {
        Bintodec(101);
    }
}
