import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contacto> aContactos = new ArrayList<Contacto>();
	
	
	public Agenda() { }
	
	public void añadirContacto(Contacto contacto) {
		this.aContactos.add(contacto);
	}
	
	public void eliminarContacto(Contacto contacto) {
		this.aContactos.remove(contacto);
	}
	
	public void modificarContacto(Contacto contacto) {
		
		int posicion = 0;
		
		for(int i = 0; i < aContactos.size(); i++) {
			if(aContactos.get(i).equals(contacto)) {
				posicion = i;
				break;
			}
		}
		
		int i = 0;
		for(Contacto c : aContactos) {
			if(c.getTelefono() == contacto.getTelefono()) {
				posicion = i;
			}
			i++;
		}
		
		this.aContactos.set(posicion, contacto);
	}
}
