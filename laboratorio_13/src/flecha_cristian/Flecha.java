package flecha_cristian;

import javax.swing.JOptionPane;

public class Flecha {
	int longitud;
	int color;
	
	public Flecha() {
		longitud = Integer.parseInt(JOptionPane.showInputDialog("ingrese la longitud de la cuerda"));
		do {
			color = Integer.parseInt(JOptionPane.showInputDialog("color de la flecha\n\n"+"1. negro\n"+"2. rojo\n"));
		} while (color!=1 && color !=2);
	}
	
	public void construirFlecha() {
		for (int i = 0; i < longitud; i++) {
			imprime("-");
		}
		imprime(">");
	}
	
	public static final String RED = "\u001B[31m";
	public static final String RESET = "\u001B[0m";
	
	/* se utiliza estos comandos debido a que al usar System.err generaba
	 * un problema con respecto a los espacios, por que opte por usar
	 * los propios colores para diferenciar las flechas, siendo que el comando
	 * RED define el color rojo a los simbolos a imprimir y el RESET vuelve
	 * al color negro para que en caso de una posible segunda flecha esta 
	 * pueda salir otra vez negra*/
	
	private void imprime(String simbolo) {
		if (color==1) {
			System.out.print(simbolo);
		}else{
			System.out.print(RED + simbolo + RESET); // para imprimir de color rojo
		}
	}
	
	public void imprimirEspacio() {
		System.out.println();
	}
	

}

