package sorting;

public class InsertionSort {
    public void sort(int[] arr){
        for(int i=0; i< arr.length -1 ; i++){
            for(int j=i+1; j>0; j --){
                if(arr[j]< arr[j-1]){
                    swap(arr,j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
