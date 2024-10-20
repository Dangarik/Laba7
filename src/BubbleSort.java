class BubbleSort implements SortingStrategy {
    public void sort(int[] arr) {
        System.out.println("Метод сортування bubble");
        int c=0;
        for(int i=1; i<arr.length; i++) {
            for(int j=0; j<arr.length-i; j++) {
                if(arr[j] > arr[j+1]) {
                    c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }
    }

}
