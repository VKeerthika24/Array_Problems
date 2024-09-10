public class Remove_Duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 6};
        int newLength = removedup(arr);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removedup(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }

        int[] temp = new int[arr.length];
        int j = 0;

        // Traverse the array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Add the last element
        temp[j++] = arr[arr.length - 1];

        // Copy the elements from temp back to arr
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;

          // Return the length of the array with unique elements
    }
}
