<<<<<<< HEAD
import java.util.Scanner;
class sum{
    public static void main(String [] args){
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int i,j,sum=0,num=0;
        for(i=1;i<=n;i++){
            num=0;
            for(j=1;j<=i;j++){
                num=num*10;
                num=num+9;
            }
            sum=sum+num;
        }
        System.out.println(sum);

    }
=======
import java.util.Scanner;
class sum{
    public static void main(String [] args){
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int i,j,sum=0,num=0;
        for(i=1;i<=n;i++){
            num=0;
            for(j=1;j<=i;j++){
                num=num*10;
                num=num+9;
            }
            sum=sum+num;
        }
        System.out.println(sum);

    }
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}