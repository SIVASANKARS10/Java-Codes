<<<<<<< HEAD
import java.util.Scanner;
class palin{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        
        
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
            System.out.print(l);
        }
        System.out.println();

    }
    for(int i=n-1;i>=0;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
            System.out.print(l);
        }
        System.out.println();



    }

    }
=======
import java.util.Scanner;
class palin{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        
        
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
            System.out.print(l);
        }
        System.out.println();

    }
    for(int i=n-1;i>=0;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
            System.out.print(l);
        }
        System.out.println();



    }

    }
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}       