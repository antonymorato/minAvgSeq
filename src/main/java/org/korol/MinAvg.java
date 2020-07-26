package org.korol;

public class MinAvg {

    /**
     * @param array input sequence of integers
     * @param k min length of sequence
     */
    public static void findMinAvgSequence(int [] array,int k){
            int size=array.length;

            if (size < k)
                return;

            int res_index = 0;

            int curr_sum = 0;
            for (int i = 0; i < k; i++) {
                if (i<array.length-1)
                {

                    curr_sum += array[i];
                    if ((curr_sum+array[i+1])/((double)(k+1))<curr_sum/((double)k))
                        k++;
                }
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

    }


}
