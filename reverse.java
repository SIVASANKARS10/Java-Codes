import java.util.Scanner;
class reverse{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=in.nextInt();
        int r=0;
        while(n!=0){
            int D=n%10;
            r=r*10+D;
            n/=10;

        }
        System.out.println("Reverse no is"+ r);
    }
}