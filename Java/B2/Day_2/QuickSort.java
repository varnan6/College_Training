package B2.Day_2;

class QuickSort {

    public int partitionQS(int[] arr, int low, int high) {

        int pivot = arr[low];
        int pivotIndex = low;

        int left = low;
        int right = high;

        for (int i = pivotIndex; i <= high; i++) {

            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;

            if (low > high)
                break;
            else {

            }

        }

        return pivot;

    }

    public void quicksort(int[] arr, int low, int high) {

        while (low < high) {
            int partition = partitionQS(arr, low, high);
            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);
        }
    }

}