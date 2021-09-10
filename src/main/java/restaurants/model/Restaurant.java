package restaurants.model;

public class Restaurant {

	private String name;
	private Anschrift adresse;
	private MenuKarte menuKarte;

	public Restaurant(String name, Anschrift adresse) {
		this.name = name;
		this.adresse = adresse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Anschrift getAdresse() {
		return adresse;
	}

	public void setAdresse(Anschrift adresse) {
		this.adresse = adresse;
	}

	public MenuKarte getMenuKarte() {
		return menuKarte;
	}

	public void setMenuKarte(MenuKarte menuKarte) {
		this.menuKarte = menuKarte;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", adresse=" + adresse + "]";
	}

}
