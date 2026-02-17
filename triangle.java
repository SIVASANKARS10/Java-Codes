import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter sides");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=a+b+c;
        System.out.println("Perimeter of rectangle is "+d);
    }
}