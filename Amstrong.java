<<<<<<< HEAD
import java.util.Scanner;
class Amstrong{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no:");
        int n=in.nextInt();
        int org=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==org){
            System.out.println("Amstrong");

        }
        else{
            System.out.println("Not an Amstrong");
        }
    }































=======
import java.util.Scanner;
class Amstrong{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no:");
        int n=in.nextInt();
        int org=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==org){
            System.out.println("Amstrong");

        }
        else{
            System.out.println("Not an Amstrong");
        }
    }































>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}