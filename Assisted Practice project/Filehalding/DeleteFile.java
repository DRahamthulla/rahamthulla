package Filehalding;
import java.io.File;

public class DeleteFile extends Exception {

	public static void main(String[] args) {
	try {
		 File file=new File("text.txt");
	      boolean value=file.delete();
	      if(value) {
	    	  System.out.println("The file is delete");
	      }
	      else {
	    	  System.out.println("The file is not delete");
	      }
	} catch (Exception e) {
	   System.out.println(e.getStackTrace());
      }
	}

}
