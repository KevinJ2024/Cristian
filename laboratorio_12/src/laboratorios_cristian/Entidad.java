package laboratorios_cristian;

import javax.swing.JOptionPane;

public class Entidad {
	/* se definen las variables de los lados, al ser privates se utilizaran 
	solo en esta clase*/
	private double ladoA;
	private double ladoB;
	// metodo para obtener los datos a utilizar
	public void ingresarDatos() {
		// se crea la variable de cadena
		String cadena;
		// se obtienen los datos de los lados de la cancha A y B
		cadena = JOptionPane.showInputDialog(null, "ingrese la longitud del lado A: ");
		ladoA = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog(null, "ingrese la longitud del lado B: ");
		ladoB = Double.parseDouble(cadena);
	}
	// metodo en donde se procesaran los datos ya obtenidos para hallar el area de la cancha
	public void calcularArea() {
		double resultado;
		resultado = ladoA * ladoB;
		JOptionPane.showInputDialog(null, "El resultado es: "+resultado);
	}
}
