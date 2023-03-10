package days06;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		String[] copyFrom = {
	            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
	            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
	            "Marocchino", "Ristretto" };
		String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9); 
		
		Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);
		System.out.println("\n\n");
		System.out.println(Arrays.toString(copyTo)); 
		
		
	}

}
