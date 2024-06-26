import sorting.InsertionSort;
import sorting.SelectionSort;

public class SortingApp {
    public static void main(String[] args) {
        int [] arr = new int[] {34,2,122,3,45,32,1232,1,2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }
}
