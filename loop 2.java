import java.util.Scanner;
class loop{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i,j,b=1,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(b+" ");
                b++;

            }
            System.out.println();
        }
    }
}