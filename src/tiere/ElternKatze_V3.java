package tiere;

public class ElternKatze_V3 extends Katze_V3
{
	private int kinderzahl;
	
	ElternKatze_V3(int gewicht_, int farbe_, int groesse_, int kinderzahl_)
	{
		super.gewicht = gewicht_;
		super.farbe = farbe_;
		super.groesse = groesse_;
		this.kinderzahl = kinderzahl_;
	}
}
