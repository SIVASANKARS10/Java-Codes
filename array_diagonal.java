import java.util.Scanner;
public class array_diagonal{
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
        for(int d = 0; d <= row + column - 1; d++){
        for(int i=row-1;i>=0;i--){
            for(int j=0;j<column;j++){
                if(i+j==d){
                
                System.out.print(arr[i][j]+ " ");
                }
            } 
            
        }
        System.out.println();
    }

    }
}