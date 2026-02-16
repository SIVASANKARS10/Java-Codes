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
}  