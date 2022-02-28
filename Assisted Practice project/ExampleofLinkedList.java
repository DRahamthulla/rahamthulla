package DataStructer;
public class ExampleofLinkedList {

	public static void main(String[] args) { 
		MYlinkedList list=new  MYlinkedList();
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(9);
		System.out.println("display..");
		list.display();
		System.out.println(list.isEmpty());
	}
}

class Node{
			int data;
	       Node address;
		}
 class MYlinkedList{
		 Node head=null;
		 Node tail=null;
public void add(int data) {
			 Node node=new Node();
			 node.data=data;
			 node.address=null;
			 if(head==null) {
				 head=node;
				 tail=node;
	
			 }else {
				 tail.address=node;
				 tail=node;

			 }	 
		 }
public void display(){
			 Node temp =head;
			 while(temp!=null) {
				 System.out.println("data...is"+temp.data);
				 System.out.println("data...is"+temp);
				 temp=temp.address;
			 }
		 }
public boolean isEmpty() {
	return head==null;
	
}
}



		
