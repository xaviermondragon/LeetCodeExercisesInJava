public class BinarySearch {
    public static int binarySearch(int[] integers, int target) {
        int left = 0;
        int right = integers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (integers[mid] == target)
                return mid;

            if (target < integers[mid]) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{}, 0));
        System.out.println(binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
