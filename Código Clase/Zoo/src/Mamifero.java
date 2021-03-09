
public class Mamifero extends Animal {

	private int nCrias = 0;
	
	public Mamifero(String nombre, String especie, int edad, double peso, int longitud, int nCrias) {
		super(nombre, especie, edad, peso, longitud);
		this.nCrias = nCrias;
		// TODO Auto-generated constructor stub
	}

	public int getnCrias() {
		return nCrias;
	}

	public void setnCrias(int nCrias) {
		this.nCrias = nCrias;
	}

	@Override
	public String toString() {
		return "Mamifero [nCrias=" + nCrias + "]";
	}
	
	public String hablar() {
		return "Los mamiferos emiten su sonido.";
	}
	
	public void soyMamifero() {
		System.out.println("Soy un método sólo de mamiferos");
	}
	
	

}
