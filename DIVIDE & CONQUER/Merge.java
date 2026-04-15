class Merge {

    public static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) return;   // base case

        int mid = s + (e - s) / 2;

        mergeSort(arr, s, mid);      // left half
        mergeSort(arr, mid + 1, e);  // right half
        merge(arr, s, mid, e);
    }

    public static void merge(int[] arr, int s, int mid, int e) {
        int temp[] = new int[e - s + 1];

        int i = s; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // left part
        while (i <= mid) temp[k++] = arr[i++];

        // right part
        while (j <= e) temp[k++] = arr[j++];

        // copy temp to original arr
        for (int p = 0; p < temp.length; p++) {
            arr[s + p] = temp[p];
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
