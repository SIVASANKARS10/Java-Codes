public class ExDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1, 4};
        int count = 0;
        boolean[] v = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (v[i] == true)
                continue;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    v[j] = true;
                }
            }
        }
        System.out.println("Duplicate count = " + count);
    }
}
