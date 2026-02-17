public class right_rotate_num {
    public static void main(String[] args) {
        int num = 4568;
        int a = num%10;   
        int b = num/10;   
        int c = Integer.parseInt(a+""+b);
        System.out.println(c);
    }
}   