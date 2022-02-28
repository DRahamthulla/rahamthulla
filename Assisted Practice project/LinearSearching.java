package Seachring;


public class LinearSearching {

	public static void main(String[] args) {
		int SearchItem=5;
		LinearSearching demo=new LinearSearching();
	    boolean status=demo.linearSearch(SearchItem);
		if(status) 
			System.out.println("found");
		else 
			System.out.println(" not found");

		}
	int [] arr= {5 ,6 ,7, 3, 7, 8}; 
	private boolean linearSearch(int searchItem) {
		boolean isFound=false;
		int size =arr.length;
		System.out.println("the size of list is " + size );
		for(int i=0;i<size;i++) {
			 int value= arr[i];
			if (value==searchItem) {
				isFound=true;
				int index=i;
				System.out.println("the element presen in the index "+index);
				System.out.println(value);
				break;
			}
		}
      return isFound;
		
	}

}
