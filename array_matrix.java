import java.util.Scanner;
public class array_matrix{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=in.nextInt();
        System.out.println("Enter column:");
        int column=in.nextInt();
        int [][] arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int a=in.nextInt();
                arr[i][j]=a;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                
                System.out.print(arr[i][j]+" ");
            } 
            System.out.println();
        }
        

    }
}