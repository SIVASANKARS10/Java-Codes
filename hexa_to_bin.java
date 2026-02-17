<<<<<<< HEAD
import java.util.Scanner;
class hexa_to_bin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        char value;
        String hexa="2A";
        String bin="";
        int n=0,i,num;
        
        for(i=0;i<hexa.length();i++){
            value=hexa.charAt(i);
            if(value>='0'&&value<='9')
                num=value-'0';
            else
                num=value-'A'+10;
            n=num;
            String temp="";
            while(n>0){
            int r=n%2;
            temp=r+temp;
            n=n/2;
        }
        
    }
    System.out.print(bin);
    
}
=======
import java.util.Scanner;
class hexa_to_bin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        char value;
        String hexa="2A";
        String bin="";
        int n=0,i,num;
        
        for(i=0;i<hexa.length();i++){
            value=hexa.charAt(i);
            if(value>='0'&&value<='9')
                num=value-'0';
            else
                num=value-'A'+10;
            n=num;
            String temp="";
            while(n>0){
            int r=n%2;
            temp=r+temp;
            n=n/2;
        }
        
    }
    System.out.print(bin);
    
}
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}