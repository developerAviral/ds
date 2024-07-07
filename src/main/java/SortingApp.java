import sorting.cyclicsort.*;

public class SortingApp {
    public static void main(String[] args) {
        int [] arr = new int[] {1,3,-1,4};
        FirstPositiveMissing missingNumber = new FirstPositiveMissing();
        System.out.print(missingNumber.get(arr));
    }
}
