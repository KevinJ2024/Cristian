package laboratorios_cristian;

import javax.swing.*;

public class Numeros {
	int numer; // se define la variable numer, el cual seran los numeros que ingresaremos
	int i, neg=0,par=0; /* se definen las variables de i para el for,
	 junto a neg y par para llevar conteo de negativos y pares */
	
	
	/* se crea el metodo de entrada en el cual se solicitaran los datos y
	se analizaran estos para saber de que tipo es, negativo o positivio */
	public void entrada() {
		for (int i = 0; i < 5; i++) {
			numer=ingresarDatos("digite 1 numero"); // se ejectua el metodo de ingresarDatos, asignandole el resultado de este a la variable numer
			// se generan las condicionales para filtrar los numeros ingresados entre negativo y pares
			if(numer%2==0) {
				par++;
			}
			if(numer<0) {
				neg++;
			}
		}
		// se imprime el mensaje en donde se mostraran los resultados de todo el proceso
		JOptionPane.showMessageDialog(null, "el numero de numeros pares es: "+par+"\n"+
		" y el numero de numeros negativos es: "+neg);
	}
	// metodo en el cual se retornara un entero, recibiendo un mensaje para obtener un valor que se llevara a el metodo entrada.
	public static int ingresarDatos(String mensaje) {
		// define las variables del metodo
		String cadena;
		int valor;
		// obtiene los datos por medio de un JOptionPane
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Integer.parseInt(cadena);
		// da el valor que el usuario escogio
		return valor;
	}
}