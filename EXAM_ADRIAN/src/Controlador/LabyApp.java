package Controlador;

import java.sql.Connection;

import Model.ConexionDB;
import Vistas.FramePrincipal;

public class LabyApp {

	public static void main(String[] args) {
		ConexionDB conexion;
		conexion = new ConexionDB("localhost","thelaby","root","tonphp");
		
		if(conexion.connectDB()==true){
		FramePrincipal frame = new FramePrincipal();
		frame.setVisible(true);
		}else{
			System.out.println("ERROR EN LA CONEXION");
		}
	}
}
