package days01;

public class Print01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("대통령은 조약을 \"체결-비준\"하고,");
		System.out.println("외교사절을 \"신임-접수\" 또는 \"파견\"하며,\n");
		System.out.println("대통령의 임기가 만료되는 때에는");
		System.out.println("임기만료 70%% 내지 40%% 전에 후임자를 선거한다.\n");
		
		System.out.println("\\n : line feed");
		System.out.println("\\t : tab");
		System.out.println("\\b : back space");
		System.out.println("\\' : print out '");
		System.out.println("\\\" : print out \"");
		System.out.printf("%%%% : print out %% <- (printf)\n");
		System.out.println("%% : print out % <- (println)");
		System.out.println("\\\\ : print out back slash");
		
		System.out.printf("abcdefg\b\b\befg");
	}

}
