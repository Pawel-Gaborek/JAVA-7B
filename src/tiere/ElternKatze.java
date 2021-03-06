package tiere;

public class ElternKatze extends Katze 
{ 
	private int kinderzahl;
	
	//ENTWEDER
	ElternKatze(int gewicht_, int farbe_, int groesse_, int kinderzahl_)
	{
		super(gewicht_, farbe_, groesse_);
		this.kinderzahl = kinderzahl;
	}
	
	//ODER
	void setterElternKatze(int gewicht_, int farbe_, int groesse_)
	{
		setterKatze(gewicht_, farbe_, groesse_);
	}
	
	super.gewicht = 10;
	super.farbe = 10;
	super.groesse = 10;
	
	void setterElternKatze_V2(int gewicht_, int farbe_, int groesse_)
	{
		super.gewicht = gewicht_;
		super.farbe = farbe_;
		super.groesse = groesse_;
	}
}
