package restaurants.model;

import java.util.ArrayList;
import java.util.List;

public class Gericht {

	private String bezeichnung;
	private List<String> zutaten;
	private double preis;
	private List<String> sonderwuensche;

	public Gericht(String bezeichnung, double preis) {
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.zutaten = new ArrayList<>();
		this.sonderwuensche = new ArrayList<>();
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public List<String> getZutaten() {
		return zutaten;
	}

	public void setZutaten(List<String> zutaten) {
		this.zutaten = zutaten;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public List<String> getSonderwuensche() {
		return sonderwuensche;
	}

}
