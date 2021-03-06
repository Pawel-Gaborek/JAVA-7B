package javaauf4;
import static java.lang.Math.*;

public class Rechnungen 
{
	private static double ergebnis_double;
	private static int ergebnis_int;
	
	public static double quadrat(double zahl_quadrat)
	{
		ergebnis_double = zahl_quadrat*zahl_quadrat;
		return ergebnis_double;
	}
	public static double quadrat(int zahl_int)
	{
		ergebnis_int = zahl_int*zahl_int;
		return ergebnis_int;
	}
	public static double wurzel(double zahl_wurzel)
	{		
		ergebnis_double = Math.sqrt(zahl_wurzel);
		return ergebnis_double;
	}
	public static int wurzel(int zahl_wurzel)
	{		
		ergebnis_int = (int)Math.sqrt(zahl_wurzel);
		return ergebnis_int;
	}
}
