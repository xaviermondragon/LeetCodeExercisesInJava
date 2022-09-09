public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0)
            return "";
        String prefix = strings[0];
        for (int i = 1; i < strings.length ; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix == "")
                return prefix;
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"abcd", "accd", "adcd"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"leetcode", "lead", "leet"}));
    }
}
