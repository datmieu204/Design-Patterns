package BAI2;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6, 7, 9, 10 };

        ArraySorter sorter = new ArraySorter();
        // sorter.setSortingStrategy(new SelectionSort());
        sorter.setSortingStrategy(new BubbleSort());
        sorter.sortArray(arr);
    }
}
