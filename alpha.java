import java.util.Scanner;

class Alpha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch++);
            }

            ch -= 2;
            for (int k = 1; k < i; k++) {
                System.out.print(ch--);
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {       
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch++);
            }

            ch -= 2;
            for (int k = 1; k < i; k++) {
                System.out.print(ch--);
            }

            System.out.println();
        }
    }
}
