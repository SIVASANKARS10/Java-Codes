import java.util.Scanner;
class Fahrenheit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a,b;
        System.out.println("Enter Fahrenheit");
        a=in.nextFloat();
        b=(a-32)*5/9;
        System.out.println("Celsius is "+b);
    }
}