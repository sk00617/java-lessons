package quicksort;
import java.util.Arrays;
public class StringSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]dogs=new String[]{"Jeff","Doge","cheems"};
		Quicksort quicksort=new Quicksort();
		quicksort.sortStrings(dogs,0,dogs.length-1);
		System.out.println(Arrays.toString(dogs));

	}

}
