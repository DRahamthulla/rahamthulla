package demo;

public class DBConnectionDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc.oracle:thin:@localhost:1521:xe";
        String userName="raham";
        String password="raham";
        Connection con =DriverManager.getConnection(url,userName,password);
        System.out.println("Connection sucess");
        }

}
