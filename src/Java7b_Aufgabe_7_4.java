import javaauf4.Rechnungen;

public class Java7b_Aufgabe_7_4 
{
	public static void main(String[] args)
	{
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 7.4 ");
		System.out.println("#################################################### */");
		Rechnungen beispiel_int = new Rechnungen();
		Rechnungen beispiel_double = new Rechnungen();
	
		System.out.println("Das ist Ergebnis fuer Int-Werte, funktion quadrat: " + beispiel_int.quadrat(5));
		System.out.println("Das ist Ergebnis fuer Double-Werte, funktion quadrat: " + beispiel_double.quadrat(5.2));
		
		System.out.println("Das ist Ergebnis fuer Int-Werte, funktion wurzel: " + beispiel_int.wurzel(16));
		System.out.println("Das ist Ergebnis fuer Double-Werte, funktion wurzel: " + beispiel_double.wurzel(16.8));
	}
}
