package Filehalding;

import java.io.File;

public class CreateNewFile {

	public static void main(String[] args) {
	File file=new File("text.txt");
	try {
		boolean value=file.createNewFile();
		if(value) {
			System.out.println("the new file is create");
		}
		else {
			System.out.println("the file already exits");
		}
	}
	catch (Exception e) {
		e.getStackTrace();
	}

	}

}
