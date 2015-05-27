package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.ConexionDB;

public class Datos {

		//CONSULTA
		private final static String USUARIOS_SEL = "SELECT * FROM cadetes WHERE id=28";
		private final static String ID_COL = "id";
		private final static String NOMBRE_COL = "SELECT nombre FROM cadetes WHERE id=28";
		private final static String APELLIDOS_COL = "SELECT apellidos FROM cadetes WHERE id=28";
		private final static String EDAD_COL = "SELECT edad FROM cadetes WHERE id=28";
		private final static String NACIONALIDAD_COL = "SELECT nacionalidad FROM cadetes WHERE id=28";
		private final static String EQUIPO_COL = "SELECT equipo FROM cadetes WHERE id=28";
		
		//ME CREO ESTE ARRAY PARA ALMACENAR LAS COLUMNAS Y LUEGO EJECUTARLAS EN EL WHILE
		private final static String[] COLUMNAS = {ID_COL,NOMBRE_COL,APELLIDOS_COL,EDAD_COL,NACIONALIDAD_COL,EQUIPO_COL};
		
		//CONEXION
		private Connection conexion = null;
		private Statement instruccion = null;
		//me creo estas variables para hacer las consultas individualmente
		private ResultSet conjuntoResultados0 = null;
		private ResultSet conjuntoResultados1 = null;
		private ResultSet conjuntoResultados2 = null;
		private ResultSet conjuntoResultados3 = null;

		
		private ArrayList<String> cadete =new ArrayList<String>();
		
		private Cadete cadeteClase = new Cadete();
		
	public Datos() {
		//OBTENEMOS CONEXION DE DATOS
		conexion = ConexionDB.getConexion();
	}
	
	public ArrayList getCadetes(){//METODO PARA RECOGER LOS CADETES
		try{
			instruccion = this.conexion.createStatement();//LA CLASE STATEMENT SIRVE PARA PODER HACER SENTENCIAS SQL
														  //LAS SIGUIENTES INSTRUCCIONES SIRVEN PARA ACCEDER A LA BASE DE DATOS Y RECOGER LO QUE HEMOS PEDIDO
			conjuntoResultados0 = instruccion.executeQuery(USUARIOS_SEL);
			conjuntoResultados1 = instruccion.executeQuery(APELLIDOS_COL);
			conjuntoResultados2 = instruccion.executeQuery(NACIONALIDAD_COL);
			conjuntoResultados3 = instruccion.executeQuery(NOMBRE_COL);

			//COLOCAMOS LOS APELLIDOS, LA NACIONALIDAD Y EL NOMBRE EL LA CLASE CADETE.
			//SOLO PASO LOS DE TIPO STRING PORQUE NO ME ACUERDO PASAR STRING A INT
			cadeteClase.setApellidos(conjuntoResultados1.toString());
			cadeteClase.setNacionalidad(conjuntoResultados2.toString());
			cadeteClase.setNombre(conjuntoResultados3.toString());
			//Añadimos al arraylist los cadetes
			while(conjuntoResultados0.next()){
				for(int i=0;i<COLUMNAS.length;i++){
				cadete.add(conjuntoResultados0.getString(COLUMNAS[i]));
				}
			}
			return cadete;
		}catch(SQLException excepcionSql){
			excepcionSql.printStackTrace();
			return cadete;
			
		}
		finally{
			try{
				conjuntoResultados0.close();
				instruccion.close();
			}catch(SQLException excepcionSql){
				excepcionSql.printStackTrace();
			}
		}
	}

}
