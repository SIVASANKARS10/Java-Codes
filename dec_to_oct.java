import java.util.Scanner;
class dec_to_oct{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int dec,rem=0;
        dec=in.nextInt();
        String oct=" ";
        while(dec>0){
            rem=dec%8;
            if(rem<10){
                oct=rem+oct;
            }
            else if(rem>=10){
                rem=(rem-10)+'A';
                oct=(char)rem+oct;
            }
            dec=dec/8;

        }
        System.out.println(oct);
    }
}