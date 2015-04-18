
public class StringOps {
	int count;

	public int linearSearch(String [] array, String query, int l, int r){
		// check each string in array  one at a time and see if it's the same as 'query'
		count = 0;
		
		while (r >= l){
			if (array[l].compareTo(query) == 0){
				// Println's were used for testing ...
				// System.out.println("Found " + array[l] + " at location " + l + ".");
				return l;
			}
			else
				return linearSearch(array, query, l + 1, r);
		}
		// System.out.println(query + " not found in array list.");
		return -1;
	}	
	
	public int binarySearch(String [] sortedArray, String query, int l, int r){
		// get midpoint of array. Compare with query.
		
		int mid = (r-l)/2;
		mid += l;
		
		if (r < l){
			 System.out.println("Query not found in array.");
			return -1;
		}

		if (sortedArray[mid].compareTo(query) < 0){
			count++;
			return binarySearch(sortedArray, query, mid + 1, r);
		}
		else if (sortedArray[mid].compareTo(query) > 0){
			count++;
			return binarySearch(sortedArray, query, l, mid - 1);
		}
		else {
			System.out.println(sortedArray[mid] + " found in array at location " + mid);
			return mid;
		}
	}
	
	public void insertSort(String [] array){
		count = 0;
		
		int j;
		String temp;
		
		for (int i = 1; i < array.length; i++){
			j = i;
			temp = array[i];
			
			while (j != 0 && array[j-1].compareTo(temp) > 0){
				array[j] = array[j - 1];
				j--;
			}
			
			array[j] = temp;
		}
	}
	
	// Essentially same as bubble sort.
	public void swapemSort(String [] array){
		
		count = 0;
		
		int l, r;
		String temp; 
		r = array.length - 1;
		// System.out.println(r);
		boolean swapped = true;
		
		while (swapped){
			swapped = false;
			for (l = 0; l < r; l++){
				
				if ( array[l].compareTo(array[l+1]) > 0 ){
					temp = array[l];
					array[l] = array[l+1];
					array[l+1] = temp;
					swapped = true;
				}
			}
		}
	}
}
