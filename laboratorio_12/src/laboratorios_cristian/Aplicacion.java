package laboratorios_cristian;

// importamos el paquete con utilidades que se usaran, en este caso el JOptionPane

import javax.swing.*;

// creacion de la clase
public class Aplicacion {
	public static void main (String args[]) {
		
		// definicion de las variables
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		// asignacion de los valores a las variables
		cadena = JOptionPane.showInputDialog(null, "ingrese la longitud del lado A: ");
		ladoA = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog(null, "ingrese la longitud del lado B: ");
		ladoB = Double.parseDouble(cadena);
		
		// obtencion del resultado
		resultado = ladoA * ladoB;
		// impresion del resultado
		JOptionPane.showMessageDialog(null, "El resutlado es: "+resultado);
	}
}
