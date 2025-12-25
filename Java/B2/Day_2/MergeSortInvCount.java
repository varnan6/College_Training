package B2.Day_2;

public class MergeSortInvCount {

    int res = 0;

    static void merge(int[] arr, int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int[] leftArr = new int[len1];
        int[] rightArr = new int[len2];

        for (int i = 0; i < len1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < len2; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int leftArrIndex = 0;
        int rightArrIndex = 0;

        int finalArrIndex = left;

        while (leftArrIndex < len1 && rightArrIndex < len2) {

            if (leftArr[leftArrIndex] < rightArr[rightArrIndex]) {
                arr[finalArrIndex] = leftArr[leftArrIndex];
                leftArrIndex++;
            } else {
                arr[finalArrIndex] = rightArr[rightArrIndex];
                rightArrIndex++;
            }

            finalArrIndex++;
        }

        while (leftArrIndex < len1) {
            arr[finalArrIndex] = leftArr[leftArrIndex];
            leftArrIndex++;
            finalArrIndex++;
        }

        while (rightArrIndex < len2) {
            arr[finalArrIndex] = rightArr[rightArrIndex];
            rightArrIndex++;
            finalArrIndex++;
        }

    }

    static int[] mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }

        return arr;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 5, 8, 9, 2, 6, 9, 3, 5, 7, 33 };

        System.out.println("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("Sorted array: ");

        for (int i : mergeSort(arr, 0, arr.length - 1)) {
            System.out.print(i + " ");
        }
    }

}