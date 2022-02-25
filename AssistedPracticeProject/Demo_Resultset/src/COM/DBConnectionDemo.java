package COM;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionDemo {
	
	public static void main(String[] args) throws Exception {
		getConnection();
	}
	public static void  getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String userName="scott";
        String password="tiger";
        Connection con =DriverManager.getConnection(url,userName,password);
        System.out.println("Connection sucess");
        }

}