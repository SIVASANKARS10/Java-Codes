import java.util.Scanner;
class Celius {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a,b;
        System.out.println("Enter Celius");
        a=in.nextFloat();
        b=(a*9/5)+32;
        System.out.println("Fahrenheit is "+b);
    }
}