
public class Main {
	public static void main(String[] args) {
		String s = "pippo";
		if(s != null && s.length() == 5) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
		
		s = null;
		
		// La lazy evaluation dopo aver valutato false la prima condizione va avanti senza valutare la seconda
		if(s != null && s.length() == 5) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
		
		// Vediamo cosa succede se invertiamo le 2 selezioni
		if(s.length() == 5 && s != null) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
	}
}
