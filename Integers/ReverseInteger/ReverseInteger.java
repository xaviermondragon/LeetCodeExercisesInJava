public class ReverseInteger {

    public static int reverseInteger(int inputInteger) {
        int reversedInteger = 0;
        int minValue = Integer.MIN_VALUE; // -2147483648
        int maxValue = Integer.MAX_VALUE; // 2147483647

        while (inputInteger != 0) {
            int lastDigit = inputInteger % 10;

            if (reversedInteger > maxValue / 10 || (reversedInteger == maxValue / 10 && lastDigit > 7))
                return 0;

            if (reversedInteger < minValue / 10 || (reversedInteger == minValue / 10 && lastDigit < -8))
                return 0;

            reversedInteger = reversedInteger * 10 + lastDigit;

            inputInteger /= 10;
        }

        return reversedInteger;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
        System.out.println(reverseInteger(-321));
        System.out.println(reverseInteger(120));
        System.out.println(reverseInteger(1000000003));
        System.out.println(reverseInteger(-1000000003));
    }
}
