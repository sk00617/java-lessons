package sortingalgorithm;
public class SortingAlgorithm {
	
	public void bubbleSort(int[] array) {
		int len = array.length-1;
		for (int i = 0; i<len; i++) {
			for(int j = 0; j<len-i; j++)
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		
	}


