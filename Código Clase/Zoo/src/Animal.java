
public abstract class Animal {
	private String nombre = "";
	private String especie = "";
	private int edad = 0;
	private double peso = 0.0;
	private int longitud = 0;
	public Animal(String nombre, String especie, int edad, double peso, int longitud) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.peso = peso;
		this.longitud = longitud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + ", peso=" + peso + ", longitud="
				+ longitud + "]";
	}
	
	public abstract String hablar();

}
