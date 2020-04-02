/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 31/03/20
 *   Time: 10:41 AM
 */

package bubblesort;

public class BubbleSort {

    /**
     * This method sorts an integer array using The Bubble Sort Technique
     *
     * @param array the array to be sorted
     */

    public void sort(int[] array) {
        int temp=0;
        int k = array.length;
        for(int i=0;i<k;i++){
            for(int j=0;j<k-1;j++){
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }


}
