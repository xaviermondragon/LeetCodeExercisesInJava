import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> singleNumbers = new HashSet<>();
        for (int num : nums) {
            if (singleNumbers.contains(num)) {
                singleNumbers.remove(num);
            } else {
                singleNumbers.add(num);
            }
        }
        return (int) singleNumbers.toArray()[0];
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1}));
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
