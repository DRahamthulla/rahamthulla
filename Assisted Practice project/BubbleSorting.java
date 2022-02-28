package Sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		BubbleSorting obj=new BubbleSorting();
		obj.SortArray();

	}
   
	int [] arr= {4,9,6,8,7,4,2};
	
	public void SortArray() {
		int size=arr.length;
		for(int i=1;i<size;i++){
			for(int j=1;j<size;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
	}
   System.out.println("After Sorting");
   for(int i=0;i<size;i++) {
	   System.out.println(arr[i]);
   }
		
}
}
