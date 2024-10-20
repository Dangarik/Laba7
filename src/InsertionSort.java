class InsertionSort implements SortingStrategy {
    public void sort(int[] arr) {
        System.out.println("Метод сортування insertion");
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
    }

}
