<<<<<<< HEAD
public class OctalAddition {
    public static void main(String[] args) {
        int a = 157;
        int b = 25;
        int carry = 0, result = 0, place = 1;

        while (a > 0 || b > 0 || carry > 0) {
            int digitSum = (a % 10) + (b % 10) + carry;
            carry = digitSum / 8;
            result += (digitSum % 8) * place;

            place *= 10;
            a /= 10;
            b /= 10;
        }

        System.out.println("Sum in octal: " + result);
    }
}
=======
public class OctalAddition {
    public static void main(String[] args) {
        int a = 157;
        int b = 25;
        int carry = 0, result = 0, place = 1;

        while (a > 0 || b > 0 || carry > 0) {
            int digitSum = (a % 10) + (b % 10) + carry;
            carry = digitSum / 8;
            result += (digitSum % 8) * place;

            place *= 10;
            a /= 10;
            b /= 10;
        }

        System.out.println("Sum in octal: " + result);
    }
}
>>>>>>> 0e87076eb389e89e07a9621377cdcf1a8f9f8f9a
