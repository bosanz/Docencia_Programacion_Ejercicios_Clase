
public class Contacto {
	
	private String nombre = "";
	private int telefono = 0;
	private String email = "";
	
	
	public Contacto() {
		
	}


	public Contacto(String nombre, int telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean equals(Contacto c1) {
		if(this.telefono == c1.getTelefono()) {
			return true;
		} else {
			return false;
		}
	}

}
