public class SelectionSortDemo {
public static void selectionSort(int[] arr) {
int n = arr.length;
int comparisons = 0;
int swaps = 0;
for (int i = 0; i < n - 1; i++) {
int minIndex = i;
for (int j = i + 1; j < n; j++) {
comparisons++;
if (arr[j] < arr[minIndex]) {
minIndex = j;
}
}
if (minIndex != i) {
int temp = arr[i];
arr[i] = arr[minIndex];
arr[minIndex] = temp;
swaps++;
}
System.out.print("After pass " + (i+1) + ": ");
printArray(arr);
}
System.out.println("comparisons: " + comparisons);
System.out.println("swaps: " + swaps);
}
public static void printArray(int[] arr) {
for (int num : arr) System.out.print(num + " ");
System.out.println();
}
public static void main(String[] args) {
int[] arr = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};
selectionSort(arr);
}
}
