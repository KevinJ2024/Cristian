package laboratorios_cristian;

public class Aplicacion_3 {
	public static void main(String args[]) {
		// se genera variable de rectangulo que almacena los datos de Entidad
		Entidad rectangulo;
		// se crea la instancia de rectangulo, es decir un objeto de la clase entidad
		rectangulo = new Entidad();
		/* los metodos de la clase entidad en donde se realizan los procesos de obtener
		datos y procesarlos para hallar el area*/
		rectangulo.ingresarDatos();
		rectangulo.calcularArea();
	}
}
