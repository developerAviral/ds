import sorting.cyclicsort.CyclicSort;
import sorting.cyclicsort.MissingNumber;

public class SortingApp {
    public static void main(String[] args) {
        int [] arr = new int[] {0,4,5,1,3};
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.getMissingNumber(arr));

    }
}
