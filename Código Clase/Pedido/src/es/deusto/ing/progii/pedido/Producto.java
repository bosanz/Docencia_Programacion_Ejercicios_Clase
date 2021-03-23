package es.deusto.ing.progii.pedido;

public class Producto {
	
	private static int ultimoID = 0;
	private int codigoProducto=0;
	private String nombre = "";
	private int cantidad = 0;
	private double precio = 0.0;
	
	public Producto(String nombre, int cantidad, double precio) {
		super();		
		this.ultimoID++;
		this.codigoProducto = ultimoID;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}


	public static int getUltimoID() {
		return ultimoID;
	}


	public static void setUltimoID(int ultimoID) {
		Producto.ultimoID = ultimoID;
	}


	public int getCodigoProducto() {
		return codigoProducto;
	}


	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
