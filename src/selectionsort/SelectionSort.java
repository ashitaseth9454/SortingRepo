/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 02/04/20
 *   Time: 3:36 AM
 */

package selectionsort;

public class SelectionSort {
    public void sort(int[] array) {
        int i=0;
        int temp=0;
        int n = array.length;
        for(i=0;i<n;i++){
            int k = i;
            for(int j = i;j<n-1;j++){//j<n-1 kyuki ham j+1 use kar rahe hain to index out of bound exception aa jayega

                if(array[k]>array[j+1]){
                    k= j+1;

                }
            }
            temp=array[i];
            array[i]=array[k];
            array[k]=temp;
        }

    }

    }