<<<<<<< HEAD
import java.util.Scanner;
public class secondmin_array{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a={10,3,4,5,-9,6};
        int min=a[0];
        int secondmin=Integer.MAX_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                secondmin=min;
                min=a[i];
            }else if(a[i]<secondmin && a[i]!=min){
                    secondmin=a[i];
         
        
    }
    
}
System.out.println("Minimum"+secondmin);

}
=======
import java.util.Scanner;
public class secondmin_array{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a={10,3,4,5,-9,6};
        int min=a[0];
        int secondmin=Integer.MAX_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                secondmin=min;
                min=a[i];
            }else if(a[i]<secondmin && a[i]!=min){
                    secondmin=a[i];
         
        
    }
    
}
System.out.println("Minimum"+secondmin);

}
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}