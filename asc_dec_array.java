import java.util.Scanner;
public class asc_dec_array{
    public static void main(String[] args){
        int []a={5,3,1,2,4};
        int temp;
        
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }   
    }
    System.out.println("Ascending:");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println("\nDescending:");
    for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]+" ");
    }
}

}