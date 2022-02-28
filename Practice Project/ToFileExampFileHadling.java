package Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ToFileExampFileHadling {
	   public static void main( String[] args ) {
		   try {
				File file=new File("raham.txt");
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
		   try {
			      FileWriter myWriter = new FileWriter("raham.txt");
			      myWriter.write("Name is Rahamthulla I am from AP ");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
	      
	      try {
		      File myObj = new File("raham.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	      try { 
		         String data = "My Roll no is 225  and have Compelet My B.tech my branch is eee my collage my name Gates in gooty";
		         File f1 = new File("raham.txt");
		         FileWriter fileWritter = new FileWriter(f1.getName(),true);
		         BufferedWriter bw = new BufferedWriter(fileWritter);
		         bw.write(data);
		         bw.close();
		         System.out.println("Done");
		      } catch(IOException e){
		         e.printStackTrace();
		         System.out.println("erro is occur");
		         
		      }
	   }
	}


