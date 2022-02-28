package Sorting;

public class InsertionSort {
	public static void main(String args[]) {
	    InsertionSort is = new InsertionSort();
	    System.out.println("Sorted Array in Ascending Order: ");
	    is.insertionSort();
	  }
	

int[] data = { 9, 5, 1, 4, 3 };

	   public void insertionSort() {
	    int size = data.length;

	    for (int i = 1; i < size; i++) {
	      int temp = data[i];
	      int j = i - 1;
	      while (j >= 0 && temp< data[j]) {
	        data[j + 1] = data[j];
	        --j;
	      }

	      data[j + 1] = temp;
	    }
	    System.out.println("After Sorting");
	    for(int i=0;i<size;i++) {
	 	   System.out.println(data[i]);
	  }

	   }
}

