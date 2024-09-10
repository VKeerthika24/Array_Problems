import java.util.ArrayList;
public class Subarray_Sum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0, currentSum = 0;

        for (int end = 0; end < n; end++) {
            // Add current element to currentSum
            currentSum += arr[end];

            // If currentSum exceeds the sum, move the start pointer to reduce the window
            while (currentSum > s && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if currentSum matches the target sum
            if (currentSum == s) {
                // Add the 1-based indices to the result
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        // If no subarray is found, return -1
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5};
        int sum1 = 12;
        System.out.println(subarraySum(arr1, arr1.length, sum1)); // Output: [2, 4]

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum2 = 15;
        System.out.println(subarraySum(arr2, arr2.length, sum2)); // Output: [1, 5]
    }
}
