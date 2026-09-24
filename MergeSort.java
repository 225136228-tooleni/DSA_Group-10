public class MergeSort {

    // Main public method to start merge sort
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    // Recursive divide method
    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, temp, left, mid);

            // Sort right half
            mergeSort(arr, temp, mid + 1, right);

            // Merge sorted halves
            merge(arr, temp, left, mid, right);
        }
    }

    // Combine/merge helper method
    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;      // Left subarray index
        int j = mid + 1;   // Right subarray index
        int k = left;      // Merged array index

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    // Test execution
    public static void main(String[] args) {
        int[] serviceTimes = {25, 10, 45, 12, 30, 5, 18};

        System.out.println("Original Service Times:");
        printArray(serviceTimes);

        sort(serviceTimes);

        System.out.println("\nSorted Service Times (Ascending):");
        printArray(serviceTimes);
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}