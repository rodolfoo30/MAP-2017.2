import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	
	 public Conexao () {    }
	    public static Connection con = null;

	    public static void Conectar() throws ClassNotFoundException {
	        System.out.println("Conectando ao banco de dados...");
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/banco","usuario","senha");
	            System.out.println("Conectado com sucesso.");
	        } catch(SQLException e) {
	              System.out.println(e);
	              throw new RuntimeException(e);
	          }
	    }

}
