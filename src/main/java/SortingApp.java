import sorting.cyclicsort.AllMissingNumber;
import sorting.cyclicsort.CyclicSort;
import sorting.cyclicsort.MissingNumber;

public class SortingApp {
    public static void main(String[] args) {
        int [] arr = new int[] {4,5,1,3,1,1,1};
        AllMissingNumber missingNumber = new AllMissingNumber();
        System.out.println(missingNumber.get(arr));

    }
}
