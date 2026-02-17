<<<<<<< HEAD
import java.util.Scanner;
public class secondmax_array{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a={10,3,4,5,-9,6};
        int max=a[0];
        int secondmax=Integer.MIN_VALUE;
       
        for(int i=1;i<a.length;i++){
            if(a[i]>  max){
                secondmax=max;
                
                max=a[i];}
                else if(a[i]>secondmax && a[i]!=max){
                    secondmax=a[i];
                }


         
        
    }
    System.out.println("Second Maximum:"+secondmax);
}
}
=======
import java.util.Scanner;
public class secondmax_array{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a={10,3,4,5,-9,6};
        int max=a[0];
        int secondmax=Integer.MIN_VALUE;
       
        for(int i=1;i<a.length;i++){
            if(a[i]>  max){
                secondmax=max;
                
                max=a[i];}
                else if(a[i]>secondmax && a[i]!=max){
                    secondmax=a[i];
                }


         
        
    }
    System.out.println("Second Maximum:"+secondmax);
}
}
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
