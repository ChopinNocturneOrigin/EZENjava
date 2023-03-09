package days06;

public class ArrayTest {

	public static void main(String[] args) {
		String[] copyFrom = {
	            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
	            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
	            "Marocchino", "Ristretto" };
		String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9); 
		
		java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);
		System.out.println("\n\n");
		System.out.println(java.util.Arrays.toString(copyTo)); 
		
		
	}

}
