
public class Autobus extends Transporte{
	private int numeroPasajeros;

	@Override
	public String toString() {
		return "Autobus [numeroPasajeros=" + numeroPasajeros + "]";
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public Autobus(String numeroMatricula, int anyoCompra, int CV, String modelo,int numeroPasajeros) {
		super(numeroMatricula, anyoCompra, CV, modelo);
		this.numeroPasajeros = numeroPasajeros;
	}
	
	
}
