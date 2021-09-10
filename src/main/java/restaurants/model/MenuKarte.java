package restaurants.model;

import java.util.List;

public class MenuKarte {

	private List<Gericht> menues;

	public MenuKarte(List<Gericht> menues) {
		this.menues = menues;
	}

	public List<Gericht> getMenues() {
		return menues;
	}

}
