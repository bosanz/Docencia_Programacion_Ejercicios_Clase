import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto c1 = new Contacto();
		Contacto c2 = new Contacto();
		Contacto c3 = new Contacto();
		
		c1.setNombre("Contacto1");
		c2.setNombre("Contacto2");
		c3.setNombre("Contacto3");
		
		c1.setTelefono(1);
		c2.setTelefono(2);
		c3.setTelefono(3);
		
		Agenda a = new Agenda();
		a.añadirContacto(c1);
		a.añadirContacto(c2);
		a.añadirContacto(c3);
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		
		for(Integer i : test) {
			test.remove(i);
		}
		
		

	}

}
