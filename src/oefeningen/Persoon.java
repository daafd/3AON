package oefeningen;

public class Persoon {
	
	private String voornaam,naam;
	private int leeftijd;
	
	public Persoon(String voornaam,String naam, int leeftijd){
		this.voornaam=voornaam;
		this.naam=naam;
		this.leeftijd=leeftijd;
	}
	
	public String printgegevens(){
		return this.getVoornaam()+" "+this.getNaam();
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}

}
