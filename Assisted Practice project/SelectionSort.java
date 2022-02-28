package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort obj=new SelectionSort();
		obj.SortArray();

	}
   
	int [] arr= {4,9,6,8,7,4,2};
	
	public void SortArray() {
		int size=arr.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
	}
   System.out.println("After Sorting");
   for(int i=0;i<size;i++) {
	   System.out.println(arr[i]);
   }
		
}
}
