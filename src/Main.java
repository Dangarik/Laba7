public class Main {
    public static void main(String[] args) {
        int[] array = {1, -10, 3, 2, 4};

        SortingStrategy sorter = new InsertionSort();
        sorter.sort(array);

        System.out.println("Відсортований масив : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] array2 = {4, 17, -6, 2, 6};
        sorter = new SelectionSort();
        sorter.sort(array2);
        System.out.println("Відсортований масив : ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        int[] array3 = {-4, 27, 7, 0, 5};
        sorter = new BubbleSort();
        sorter.sort(array3);
        System.out.println("Відсортований масив : ");
        for (int num : array3) {
            System.out.print(num + " ");
        }
    }
}
