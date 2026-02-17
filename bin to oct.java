<<<<<<< HEAD
import java.util.Scanner;
class octal{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int value;

        String bin="1010111",oct="";
        while(bin.length()%3!=0){
            bin="0"+bin;
        }  
        for(int i=0;i<bin.length();i=i+3){
            value=0;
            value+=(bin.charAt(i)-'0')*4;
            value+=(bin.charAt(i+1)-'0')*2;
            value+=(bin.charAt(i+2)-'0')*1;
            oct=oct+value;

        }
        System.out.print(oct);
    }
=======
import java.util.Scanner;
class octal{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int value;

        String bin="1010111",oct="";
        while(bin.length()%3!=0){
            bin="0"+bin;
        }  
        for(int i=0;i<bin.length();i=i+3){
            value=0;
            value+=(bin.charAt(i)-'0')*4;
            value+=(bin.charAt(i+1)-'0')*2;
            value+=(bin.charAt(i+2)-'0')*1;
            oct=oct+value;

        }
        System.out.print(oct);
    }
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}