package Recursion;

public class CheckWhetherArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {5, 5, 3, 2, 1};
        System.out.println(sortedOrNot(arr, 0));
        System.out.println(sortedOrNot(arr1, 0));
    }

    static boolean sortedOrNot(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[0] < arr[1]) {
            if (arr[index] <= arr[index + 1]) {
                return sortedOrNot(arr, index + 1);
            } else {
                return false;
            }
        } else {
            if (arr[index] >= arr[index + 1]) {
                return sortedOrNot(arr, index + 1);
            } else {
                return false;
            }
        }
    }
}
