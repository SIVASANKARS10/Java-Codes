<<<<<<< HEAD
public class merge_2array{
    public static void main(String[] args){
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
     }
=======
public class merge_2array{
    public static void main(String[] args){
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
     }
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
}   