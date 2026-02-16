import java.util.Scanner;
class odd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}