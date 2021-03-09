
public class Transporte {
	
	private String numeroMatricula = "";
	private int anyoCompra = 0;
	private int CV = 0;
	private String modelo = "";
	
	
	protected Transporte(String numeroMatricula, int anyoCompra, int cV, String modelo) {
		super();
		this.numeroMatricula = numeroMatricula;
		this.anyoCompra = anyoCompra;
		this.CV = cV;
		this.modelo = modelo;
	}
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public int getAnyoCompra() {
		return anyoCompra;
	}
	public void setAnyoCompra(int anyoCompra) {
		this.anyoCompra = anyoCompra;
	}
	public int getCV() {
		return CV;
	}
	public void setCV(int cV) {
		CV = cV;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Transporte [numeroMatricula=" + numeroMatricula + ", anyoCompra=" + anyoCompra + ", CV=" + CV
				+ ", modelo=" + modelo + "]";
	}
	
	
	

}
