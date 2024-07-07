package sorting.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumbers {
    public List<Integer> get(int [] arr){
        List<Integer> result = new ArrayList<Integer>();
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                    swap(arr, i, correctIndex);
            }
           else{
                i++;
            }
        }

        for(int index=0; index < arr.length; index++){
            if(arr[index] != index + 1){
                result.add(arr[index]);
            }
        }

        return  result;
    }

    private void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
