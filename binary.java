<<<<<<< HEAD
import java.util.Scanner;
class binary{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        String bin=" ";
        while(n>0){
            int r=n%2;
            bin=r+bin;
            n=n/2;
        }
        System.out.print("bin:"+bin);
    }
=======
import java.util.Scanner;
class binary{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        String bin=" ";
        while(n>0){
            int r=n%2;
            bin=r+bin;
            n=n/2;
        }
        System.out.print("bin:"+bin);
    }
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}  