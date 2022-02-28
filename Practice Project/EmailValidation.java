package assigment2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmailValidation {
		List<String> mail=new ArrayList<String>();
		public static void main (String[] agrs) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your Email id:");
		    String s=input.next();
			EmailValidation st=new EmailValidation();
		    st.Checkmail(s);
		}
		
		}	
public void Checkmail(String s) {
	 mail.add("raham@gamil.com");
	 mail.add("sai@gmail.com");
	 mail.add("deepu@gmail.com");
	 mail.add("juber@gmail.com");
	 mail.add("prathap@gmail.com");
	 if(mail.contains(s)) {
		 System.out.println("mail is vaild");
		 
	 }else {
		 System.out.println("mail is not vaild");
	 }
	}

}