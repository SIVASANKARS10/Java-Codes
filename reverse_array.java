import java.util.Scanner;
public class reverse_array{
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
            System.out.println(a[i]+"");
        }
        System.out.println("\nReverse:");
        for(int i=n-1;i>=0;i--){
        System.out.println(a[i]+"");
    }
}
} 