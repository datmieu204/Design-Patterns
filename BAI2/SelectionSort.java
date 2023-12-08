package BAI2;

public class SelectionSort implements SortingStrategy {

    @Override
    public void sort(int[] arr) {

        int n = arr.length;

        System.out.println("Selection sort array:");

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
