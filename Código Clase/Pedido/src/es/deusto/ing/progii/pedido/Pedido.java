package es.deusto.ing.progii.pedido;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	
	private ArrayList<Producto> aProducto = new ArrayList<Producto>();
	
	private Date fecha;
	private String cliente = "";
	private boolean estaPagado = false;
	
	public Pedido(Date fecha, String cliente, boolean estaPagado) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
		this.estaPagado = estaPagado;
	}
	
	public void añadirProducto(Producto p) {
		this.aProducto.add(p);
	}
	
	public double getTotal() {
		double total = 0.0;
		for(Producto p:this.aProducto) {
			total += p.getPrecio();
		}
		
		return total;
	}
	
	public double getTotal(int iva) {
		double porcentaje = (iva / 100.0) + 1;
		return getTotal() * porcentaje;
	}

}
