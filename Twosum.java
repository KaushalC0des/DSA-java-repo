public class Twosum {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based indexing
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // In case no pair is found (shouldn't happen here)
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);  // Call static method directly

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

