public class ReverseString {

    public static String reverseString(char[] inputArray) {
        StringBuilder outputString = new StringBuilder();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            outputString.append(inputArray[i]);
        }
        return outputString.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Xavier".toCharArray()));
    }
}
