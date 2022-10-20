package com.currencydenomination.Services;

public class MergeSort {
void merge(int array[], int left, int mid, int right){
    
    //Find size of two sub arrays to be merge
    int array1 = mid - left + 1;
    int array2 = right - mid;
    
    // Create Temporary Arrays
    int leftArray[] = new int[array1];
    int rightArray[] = new int[array2];

    //Copy data to Temporary Arrays
    for(int i = 0; i < array1; ++i){
        leftArray[i] = array[left + i];
    } 
    for(int j = 0; j < array2; ++j){
        rightArray[j] = array[mid + 1 + j];
    }

    // Merge Temporary Arrays

    int i = 0, j = 0; //Initialize index of two sub Array.
    int k = left; //Initialize index of merge sub Array

    while(i < array1 && j < array2){
        if(leftArray[i] >= rightArray[j]){
            array[k] = leftArray[i];
            i++;
        }else{
            array[k] = rightArray[j];
            j++;
        }
        k++;
    }

    //Copy remaining elements of Left Array[] if any
    while(i < array1){
        array[k] = leftArray[i];
        i++;
        k++;
    }

     //Copy remaining elements of Right Array[] if any
     while(j < array2){
        array[k] = rightArray[j];
        j++;
        k++;
    }

}

/* Main Function that Sorts Array [Left............Right]
 * Using Merge()
 */
public void sort(int[] notes, int left, int right){
   
    if(left < right) {
        int mid = (left + right) / 2; // find the middle point

        sort(notes, left, mid); // sort first half
        sort(notes, mid + 1, right); // sort second half

        merge(notes, left, mid, right); //Merge the sorted halves
    }
}
}
