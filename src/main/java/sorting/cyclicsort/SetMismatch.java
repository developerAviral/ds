package sorting.cyclicsort;

public class SetMismatch {
    public int[] get(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }
            else {
                i++;
            }
        }

        for(int index = 0; index< arr.length; index++){
            if(arr[index] != index + 1){
                return new int[]{arr[index],arr[index]+1 };
            }
        }
        return new int[] {-1,-1};
    }

    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
