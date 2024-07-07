package sorting.cyclicsort;

public class DuplicateNumbers {

    public int get(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correctIndex = arr[i] - 1;

            if(arr[i] != i+1) {
                if (arr[i] != arr[correctIndex]) {
                    swap(arr,i,correctIndex);
                }
                else {
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
