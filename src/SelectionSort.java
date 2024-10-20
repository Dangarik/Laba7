class SelectionSort implements SortingStrategy {
    public void sort(int[] arr) {
        System.out.println("Метод сортування selection");
        for (int i = 0; i < arr.length - 1; i++) {
            int jMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[jMin]) {
                    jMin = j;
                }
            }
            if (jMin != i) {
                swap(arr, i, jMin);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}