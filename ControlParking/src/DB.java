import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DB {
	Connection conexion = null; //maneja la conexión
	Statement instruccion = null;// instrucción de consulta
	ResultSet conjuntoResultados = null;// maneja los resultados
	
	public DB() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			// establece la conexión a la base de datos
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/apuestas","root","tonphp");
			// crea objeto Statement para consultar la base de datos
			instruccion = (Statement) conexion.createStatement();
			}catch( SQLException excepcionSql ){
			excepcionSql.printStackTrace();
			}// fin de catch
	}
	
	public void leerCoches(){
		
			instruccion = (Statement) conexion.createStatement();
			// consulta la base de datos
			conjuntoResultados = instruccion.executeQuery("SELECT");
			//Mostrar por pantalla
			while (conjuntoResultados.next())
			{

			}
			conjuntoResultados.close();

	}	

}
