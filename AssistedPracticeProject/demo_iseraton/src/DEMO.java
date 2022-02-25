import java.sql.DriverManager;

public class DEMO {

	public static void main(String[] args) {
		DriverManager.registerDriver(new OracleDriver());
		System.out.println("");

	}

}
