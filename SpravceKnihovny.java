package knihovna;

import java.util.HashMap;
import java.util.Scanner;

public class SpravceKnihovny {
	private HashMap<String, kniha> knihovnaMapa;
	SpravceKnihovny(){
		knihovnaMapa = new HashMap<String, kniha> ();
		
	}
	public static void pridatKnihu() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("vyberte typ knihy (roman/ucebnice");
		  String typKnihy = sc.nextLine();
		  System.out.println("Zadejte název knihy:");
	    String nazev = sc.nextLine();

	    System.out.println("Zadejte jméno autora:");
	    String autor = sc.nextLine();

	    System.out.println("Zadejte rok vydání:");
	    int rok_vydani = sc.nextInt();

	    System.out.println("Je kniha k dispozici? (true/false)");
	    boolean kDispozici = sc.nextBoolean();
	    sc.nextLine(); // Zde přečteme zbytek řádku (nový řádek), aby se další vstup načetl správně
	    if (typKnihy.equals("roman")) {
	  	  System.out.println("zadejte žánr románu");
	  	  String zanr = sc.nextLine();
	  	  Romany roman1 = new Romany(nazev,autor,rok_vydani,kDispozici,zanr);
	  	  knihovnaMapa.put(nazev, roman1);
	  	
	    }
	    else if (typKnihy.equals("ucebnice")) {
	     System.out.println("zadejte pro jaký ročník je kniha vhodná");
	     int vhodnost = sc.nextInt();
	     sc.nextLine(); // Zde přečteme zbytek řádku (nový řádek), aby se další vstup načetl správně
	     ucebnice ucebnice1 = new ucebnice (nazev, autor, rok_vydani, kDispozici, vhodnost);
	     knihovnaMapa.put(nazev, ucebnice1);
	    }
	    else {
	    	System.out.println("nebyl zadan platný typ");
	    	return;
	    }
	    System.out.println("kniha byla přidána");
	}
	public static void zmenitUdajeOKnize(HashMap<String, kniha> knihovnaMapa) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Zadejte název knihy, jejíž údaje chcete změnit:");
	    String nazevKnihy = sc.nextLine();
	    
	    if (knihovnaMapa.containsKey(nazevKnihy)) {
	        kniha nalezenaKniha = knihovnaMapa.get(nazevKnihy);

	        System.out.println("Zadejte nový název knihy:");
	        String novyNazev = sc.nextLine();
	        nalezenaKniha.setNazev(novyNazev);

	        System.out.println("Zadejte nového autora knihy:");
	        String novyAutor = sc.nextLine();
	        nalezenaKniha.setAutor(novyAutor);

	        System.out.println("Zadejte nový rok vydání knihy:");
	        int novyRokVydani = sc.nextInt();
	        nalezenaKniha.setRokVydani(novyRokVydani);

	        System.out.println("Je kniha k dispozici? (true/false)");
	        boolean novaDostupnost = sc.nextBoolean();
	        nalezenaKniha.setKDispozici(novaDostupnost);

	        knihovnaMapa.put(novyNazev, nalezenaKniha);
	        knihovnaMapa.remove(nazevKnihy);

	        System.out.println("Údaje o knize " + nazevKnihy + " byly úspěšně změněny.");
	    } else {
	        System.out.println("Kniha s názvem " + nazevKnihy + " nebyla nalezena.");
	    }
	}
	public static boolean smazatKnihu (HashMap<String, kniha> knihovnaMapa, String nazev) {
		if (knihovnaMapa.remove(nazev)!=null)
			return true;
		return false;
		
	}
	public void vypisKnihovny () {
		
		
	} 
}
