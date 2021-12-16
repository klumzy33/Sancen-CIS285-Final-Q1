package ProgrammingKnowledge;

import static org.junit.Assert.*;



import org.junit.Test;
import java.util.Arrays;

public class testSelectionSort {

		@Test
		public void test() {
			testPositive();
			testNegative();
			testMixed();
		}

    SelectionSort FinalOne = new SelectionSort();

    @Test
    public void testPositive(){
        int[] arr = new int[]{8,9,7,10,2};
        int[] res = new int[]{2,7,8,9,10};
        SelectionSort.sort(arr);
        assert(Arrays.equals(arr,res));
    }

    @Test
    public void testNegative(){
        int[] arr = new int[]{-8,-9,-7,-10,-2};
        int[] res = new int[]{-10,-9,-8,-7,-2};
        SelectionSort.sort(arr);
        assert(Arrays.equals(arr,res));
    }

    @Test
    public void testMixed(){
        int[] arr = new int[]{-8,-9,7,-10,2,0};
        int[] res = new int[]{-10,-9,-8,0,2,7};
        SelectionSort.sort(arr);
        assert(Arrays.equals(arr,res));
    }
}
