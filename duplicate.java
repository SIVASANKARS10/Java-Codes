<<<<<<< HEAD
public class duplicate {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 4, 5, 6};
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
=======
public class duplicate {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 4, 5, 6};
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
