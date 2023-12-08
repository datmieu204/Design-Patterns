package BAI2;

public class ArraySorter {
    private SortingStrategy strategySort;

    public void setSortingStrategy(SortingStrategy strategySort) {
        this.strategySort = strategySort;
    }

    public void sortArray(int[] arr) {

        if (arr == null) {
            System.out.println("Array is null");
            return;
        }

        strategySort.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
