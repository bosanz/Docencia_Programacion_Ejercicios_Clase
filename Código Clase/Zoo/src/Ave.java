import java.awt.Color;

public class Ave extends Animal {
	
	private int tamanyo = 0;
	private Color color; 

	public Ave(String nombre, String especie, int edad, double peso, int longitud, int tam, Color color) {
		super(nombre, especie, edad, peso, longitud);
		this.color = color;
		this.tamanyo = tam;
		// TODO Auto-generated constructor stub
	}

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Ave [tamanyo=" + tamanyo + ", color=" + color + "]";
	}

	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
