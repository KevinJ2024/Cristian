package lab;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		listaProductos.add(new Producto("papitas",100,50));
		listaProductos.add(new Producto("cholao",7000,10));
		listaProductos.add(new Producto("raspao",5000,5));
		
		// muestra los datos ingresados al arraylist		
		for(Producto prod: listaProductos) {
			prod.mostrarProducto();
			System.out.println("------------------------");
		}
		// modificacion y eliminacion de productos
		listaProductos.get(0).setPrecio(300);
		listaProductos.remove(2);
		
		// proceso de la consulta
		String consulta = JOptionPane.showInputDialog("ingrese el nombre del producto a buscar");
		Producto resConsulta = consultar(listaProductos,consulta);
		
		/*
		listaEmpleados.add(new Empleado("pepe",20000));
		listaEmpleados.add(new Empleado("lucas",1000|00));
		listaEmpleados.add(new Empleado("tyrone",3000));

		for (Empleado emp: listaEmpleados) {
			emp.mostrarInfo();
			System.out.println("-----------------");
		}
		
		listaEmpleados.get(1).setSalario(3700.0);
		
		System.out.println("Informacion actualizada del segundo empleado");
		listaEmpleados.get(1).mostrarInfo();
		
		listaEmpleados.remove(0);
		
		System.out.println("\nLista de empleados despues de eliminar al primero");
		for (Empleado emp: listaEmpleados) {
			emp.mostrarInfo();
			System.out.println("-----------------");
		}
		/*
		/*
		// creacion del objeto de empleado
		Empleado empleado1 = new Empleado("juan Perez",3000.00);
		// creacion de los productos
		Producto producto1 = new Producto("pepsi",1500,50);
		Producto producto2 = new Producto("coca cola",2000,100);
		
		// mostrar el empleado
		empleado1.mostrarInfo();
		// modificacion de los empleados
		empleado1.setNombre("Carlos Ruiz");
		empleado1.setSalario(3500.0);
		// modificacion para comprobar la verificacion
		empleado1.setSalario(-1000.0);
		// mostrar el empleado con los datos modificados
		empleado1.mostrarInfo();
		
		// mostrar la info del producto1
		producto1.mostrarProducto();
		// modificacion del producto1
		producto1.setNombre("Doritos");
		producto1.setPrecio(1000);
		producto1.setcantidadStock(5);
		// mostrar el producto1 con datos modificados
		producto1.mostrarProducto();
		*/
	}
	/* metodo que toma la lista de productos y el valor de la consulta para compararlos
	y mostrar la info de este en caso de encontrarla*/
	public static Producto consultar(ArrayList<Producto> listaProductos, String consulta) {
        for (Producto prod : listaProductos) {
            // busca el nombre del producto y lo compara con el ingresado para consultar
            if (prod.getNombre().equalsIgnoreCase(consulta)) {
            	System.out.println("Producto encontrado:");
                prod.mostrarProducto();
                return prod; 
            }
        }
        return null; 
    }
}
