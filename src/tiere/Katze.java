package tiere; 

public class Katze 
{
	private int gewicht; 
	private int farbe; 
	private int groesse;
	
	Katze(int gewicht_, int farbe_, int groesse_)
	{
		this.gewicht = gewicht_; 
		this.farbe = farbe_; 
		this.groesse = groesse_;
	}
	
	void setterKatze(int gewicht_, int farbe_, int groesse_)
	{
		this.gewicht = gewicht_; 
		this.farbe = farbe_; 
		this.groesse = groesse_;
	}
}
