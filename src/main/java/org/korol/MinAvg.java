package org.korol;

public class MinAvg {

    /**
     * @param array input sequence of integers
     * @param k min length of sequence
     * @return
     */
    public static int[] findMinAvgSequence(int [] array, int k){
            int size=array.length;

            //making min size of sequence 2
            if (k<2)
                k=2;

            if (size < k)
                return new int[]{};

            int res_index = 0;

            int curr_sum = 0;
            for (int i = 0; i < k; i++) {
                    curr_sum += array[i];
            }

            int min_sum = curr_sum;

            for (int i = k; i < size; i++) {

                curr_sum += array[i] - array[i - k];

                if (curr_sum < min_sum) {
                    min_sum = curr_sum;
                    res_index = (i - k + 1);
                }

            }



            System.out.println("Subarray between [" +
                    res_index + ", " + (res_index + k - 1) +
                    "] has minimum average");

            int []resArray=new int[k];
        for (int i = res_index,j=0; i <=res_index+k-1; i++,j++) {
            resArray[j]=array[i];
        }
            return resArray;
    }


}
