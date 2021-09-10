package restaurants.model;

import java.util.List;
import java.util.stream.Collectors;

public class Bestellung {

	private List<Gericht> auswahl;
	private double gesamtPreis;
	
	public List<Gericht> getAuswahl() {
		return auswahl;
	}
	public void setAuswahl(List<Gericht> auswahl) {
		this.auswahl = auswahl;
	}
	
	public double getGesamtPreis() {
		final double betrag = 
				this.getAuswahl()
				.stream()
				.collect(Collectors.summingDouble(Gericht::getPreis));
		return betrag;
	}
	
	

}
