package es.deusto.ing.progii.pedido;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido p1 = new Pedido(new Date(2021,03,16), "Bruce Wayne", false);
		p1.añadirProducto(new Producto("Jabon", 2, 2.14));
		p1.añadirProducto(new Producto("Lejia", 2, 3.14));
		p1.añadirProducto(new Producto("Desodorante", 2, 1.14));
		p1.añadirProducto(new Producto("Bolsas de basura", 2,  2.14));
		
		System.out.println(p1.getTotal());
		System.out.println(p1.getTotal(21));

	}

}
