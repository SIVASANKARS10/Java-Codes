import java.util.Scanner;
class add{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i,j,a=0,b=0,n=2;
        for(i=0;i<n;i++){
            a=a*10+9;
            b=b+a;
        }
        System.out.print(b);
    }
}