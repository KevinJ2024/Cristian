package laboratorios_cristian;

import javax.swing.*;

public class Aplicacion_2 {
	public static void main (String args[]) {
		// definicion de las variables a utilizar
		double ladoA;
		double ladoB;
		// se llama la funcion de ingresarDatos para obtener el valor de los lados de la cancha
		ladoA = ingresarDatos("ingrese la longitud del lado A: ");
		ladoB = ingresarDatos("ingrese la longitud del lado B: ");
		// se ejecuta el metodo para calcular el area de la cancha
		calcularArea(ladoA,ladoB);
	}
	/*se define la funcion que tendra el objetivo de obtener los datos 
	 * de los lados de la cancha, recibiendo como parametro el mensaje
	 * correspondiente de cada lado.*/
	public static double ingresarDatos(String mensaje) {
		// se define las variables del metodo
		String cadena;
		double valor;
		// se obtienen los datos
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Double.parseDouble(cadena);
		// regresa el valor asignado al lado correspondiente
		return valor;
	}
	// se genera el metodo con el objetivo de hallar el area de la cancha
	public static void calcularArea (double a, double b) {
		// se define la variable que contendra el valor del resultado
		double resultado;
		// se realiza el procedimiento para calcular el area
		resultado = a * b;
		// se imprime el resultado
		JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
	}
}
