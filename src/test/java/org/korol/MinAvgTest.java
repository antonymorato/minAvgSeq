package org.korol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTest {

    @Test
    public void wrightMinAvgForSeqWith2Nums() {
        int[] array = new int[]{12, 86, 55, 5, 6, 10, 3, 12};
        int[] resArray = MinAvg.findMinAvgSequence(array, 2);
        int[] expectedArray=new int[]{5,6};
        assertArrayEquals(expectedArray,resArray );
    }

    @Test
    public void wrightMinAvgForSeqWith3Nums() {
        int[] array = new int[]{12, 86, 55, 5, 6, 10, 3, 12};
        int[] resArray = MinAvg.findMinAvgSequence(array, 3);
        int[] expectedArray=new int[]{6, 10,3};
        assertArrayEquals(expectedArray,resArray);
    }
}