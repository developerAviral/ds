package sorting;

public class SelectionSort {
    public void sort(int[] arr){
        for(int i =0 ; i< arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr,maxIndex, last);
        }
    }

    private int getMaxIndex(int [] arr ,int end){
        int max = 0;
        for(int i=0; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
