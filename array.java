<<<<<<< HEAD
import java.util.Scanner;
public class array{
    public static void main(String[] args){
        int n;
        int[] a=new int[5];
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.print("\n Array elements: \n");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
=======
import java.util.Scanner;
public class array{
    public static void main(String[] args){
        int n;
        int[] a=new int[5];
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.print("\n Array elements: \n");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}