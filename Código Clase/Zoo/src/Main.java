
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reptil r = new Reptil("Serpiente", "Python", 20, 100, 200);
		System.out.println(r.hablar());
		
		Animal a1 = new Mamifero("leon", "Simba", 20, 100, 200,2);
		System.out.println(a1.hablar());
		
		if(a1 instanceof Animal) {
			System.out.println("Soy animal");
		}
		if(a1 instanceof Mamifero) {
			System.out.println("Soy mamifero");
		}
		if(a1 instanceof Object) {
			System.out.println("Soy un objeto.");
		}
		
		Mamifero m1 = new Mamifero("leona", "Nala", 20, 100, 200,2);
		if (m1 instanceof Animal) {
			System.out.println("También soy animal.");
		}
		
		((Mamifero)a1).getnCrias();

	}

}
