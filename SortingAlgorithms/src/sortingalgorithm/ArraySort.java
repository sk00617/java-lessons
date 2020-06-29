package sortingalgorithm;
import java.util.Arrays;

public class ArraySort {
	public static void main(String[]args) {
		int[] array= {23,2,5,1,6};
		SortingAlgorithm sortingAlgo=new SortingAlgorithm();
		sortingAlgo.bubbleSort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
