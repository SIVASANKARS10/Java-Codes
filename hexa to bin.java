import java.util.Scanner;
class hexa{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int dec,rem=0;
        dec=in.nextInt();
        String hex=" ";
        while(dec>0){
            rem=dec%16;
            if(rem<10){
                hex=rem+hex;
            }
            else if(rem>=10){
                rem=(rem-10)+'A';
                hex=(char)rem+hex;
            }
            dec=dec/16;

        }
        System.out.println(hex);
    }
}