package knihovna;

import java.util.HashMap;
import java.util.Scanner;

public class test {

	public static void main(String[] args) 
	{
		int operace;
		HashMap<String, kniha> knihovnaMapa = new HashMap<>();
		do {
		System.out.println("jakou operaci chcete provést");
		System.out.println("1: přidání knihy");
		System.out.println("2: úprava knihy");
		System.out.println("3: smazání knihy");
		System.out.println("4: označení knihy jako vypůjčené");
		System.out.println("5: Výpis knih");
		System.out.println("6: vyhledání knihy");
		System.out.println("7: výpis všech knih od určitého autora");
		System.out.println("8: výpis všech knih konkrétního žánru");
		System.out.println("9: výpis všech vypůjčených knih");
		System.out.println("10: uložení informace o knize do souboru");
		System.out.println("11: načtení informací ze souboru");
		
		
		Scanner sc = new Scanner(System.in);
		operace = sc.nextInt();
		switch (operace){
			case 1:
				SpravceKnihovny.pridatKnihu(knihovnaMapa);
				break;
			case 2:
				SpravceKnihovny.zmenitUdajeOKnize(knihovnaMapa);
				break;
			case 3:
				System.out.println("zadej název knihy")
				String nazev = sc.next();
				SpravceKnihovny.smazatKnihu(knihovnaMapa, nazev);
			case 0:
				System.out.println ("konec programu");
				break;
			default:
				System.out.println("neplatná volba");
		
		}
		}while (operace !=0);
	}

}

