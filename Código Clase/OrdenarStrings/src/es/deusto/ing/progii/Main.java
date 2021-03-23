package es.deusto.ing.progii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<>();
		aList.add("Perro");
		aList.add("aloha");
		aList.add("Salto");
		aList.add("burbuja");
		aList.add("abeja");
		
		Collections.sort(aList, new StringComparator());
		
		System.out.println(aList);

	}

}
