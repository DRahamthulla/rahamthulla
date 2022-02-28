package Seachring;

public class BinarySearchDemo{

	public static void main(String[] args) {
		int searchItem=1;
		BinarySearchDemo obj=new BinarySearchDemo();
		boolean status=obj.search(searchItem);
			System.out.println(status);
	}
	int [] arr= {1,3,4,5,6,7,8,9,};
	public boolean search(int searchItem) {
	 boolean isFound=false;
	int low=0;
	int high=arr.length-1;
	int mid=0;
    while(low<=high) {
    	mid=(low+high)/2;
    	int arrvalue=arr[mid];
    	if(searchItem==arrvalue) {
    		isFound=true;
    		//System.out.println( "The element of the index is :"+mid);
    		System.out.println("The value is "+searchItem +" in the index of "+mid);
    		break;
	}else if (searchItem<arrvalue){
		high=mid-1;
	}else if(searchItem>arrvalue) {
		low=mid+1;
	}else{
    	System.out.println("The give element is not present in the list");
	}
	}
    return isFound;
}
}