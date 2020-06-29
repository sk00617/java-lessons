package quicksort;

public class Quicksort {
	public void sortStrings(String[] a, int start, int end){
	    int i = start;
	    int j = end;
	    if (j - i >= 1) {
	    	String pivot = a[i].toLowerCase();
	        while (j > i){
	        	while (a[i].toLowerCase().compareTo(pivot) <= 0 && i < end && j > i){
	        		i++;
	            }
	            while (a[j].toLowerCase().compareTo(pivot) >= 0 && j > start && j >= i){
	                j--;
	            }
	            if (j > i)
	                swap(a, i, j);
	            }
	            swap(a, start, j);
	            sortStrings(a, start, j - 1);
	            sortStrings(a, j + 1, end);
	        }
	    }
	    public void swap(String[] a, int i, int j){
	    	String temp = a[i];
	    	a[i] = a[j];
	    	a[j] = temp;
	    }
}
