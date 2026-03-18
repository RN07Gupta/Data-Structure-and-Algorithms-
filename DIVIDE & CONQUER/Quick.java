class Quick {

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quick(int[] arr, int s, int e) {

        if (s >= e) {
            return;
        }

        int pidx = partition(arr, s, e);

        quick(arr, s, pidx - 1);   // left
        quick(arr, pidx + 1, e);   // right
    }

    public static int partition(int[] arr, int s, int e) {

        int pivot = arr[e];
        int i = s - 1;

        for(int j = s; j < e; j++) {

            if(arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;

        // swap pivot to correct position
        int temp = arr[e];
        arr[e] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};

        quick(arr, 0, arr.length - 1);
        printArr(arr);
    }
}