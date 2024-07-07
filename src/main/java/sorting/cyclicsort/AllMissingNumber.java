package sorting.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumber {
    public List<Integer> get(int[] arr){
        List<Integer> results = new ArrayList<Integer>();
        int i = 0;

        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i, correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index = 0 ; index < arr.length ; index++){
           if(arr[index] != index){
               results.add(index);
           }
        }

        return results;
    }

    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
