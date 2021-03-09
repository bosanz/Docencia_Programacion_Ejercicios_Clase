
public class Taxi extends Transporte{
	private int numeroLicencia = 0;

	public Taxi(String numeroMatricula, int anyoCompra, int CV, String modelo, int numeroLicencia) {
		super(numeroMatricula, anyoCompra, CV, modelo);
		this.numeroLicencia = numeroLicencia;
	}
	
	public int getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(int numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	

	@Override
	public String toString() {
		return "Taxi [numeroLicencia=" + numeroLicencia + "]";
	}
	
}
