package lab;

import javax.swing.JOptionPane;

public class Producto {
	private String nombre;
	private double precio;
	private int cantidadStock;
	
	public Producto(String nombre,double precio,int cantidadStock) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}else {
			System.out.println("El precio debe de ser positivo");
		}
	}
	
	public double getcantidadStock() {
		return cantidadStock;
	}
	
	public void setcantidadStock(int cantidadStock) {
		if (cantidadStock > 0) {
			this.cantidadStock = cantidadStock;
		}else {
			System.out.println("La cantidad de stock debe de ser positiva");
		}
	}
	
	public void mostrarProducto() {
		System.out.println("Nombre del producto: "+nombre);
		System.out.println("Precio: $"+precio);
		System.out.println("cantidad en Stock: "+cantidadStock);
	}
}


