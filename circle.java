import java.util.Scanner;
class circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a,b;
        System.out.println("Enter radius");
        a=in.nextInt();
        b=3.14*a*a;
        System.out.println("Area of circle is "+b);
    }
}