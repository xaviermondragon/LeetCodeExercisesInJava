import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeNumber {
    /*
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
     */
    public static boolean palindromeNumber(int number) {
        List<Integer> digitsList = new ArrayList<>();

        do {
            digitsList.add(number % 10);
            number = number / 10;
        } while (number > 0);


        int i = 0;
        int j = digitsList.size() - 1;

        while (i < j) {
            if (!Objects.equals(digitsList.get(i), digitsList.get(j)))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeNumber(0));
        System.out.println(palindromeNumber(00));
        System.out.println(palindromeNumber(10));
        System.out.println(palindromeNumber(121));
    }
}
