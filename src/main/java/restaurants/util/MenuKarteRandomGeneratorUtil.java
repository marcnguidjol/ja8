package restaurants.util;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

import restaurants.model.Gericht;
import restaurants.model.MenuKarte;

public class MenuKarteRandomGeneratorUtil {
	
	public static MenuKarte erzeugeMenuKarte(
			final int maxAnzahlGerichte, final double minPreisGericht, final double maxPreisGericht) {
		
		List<Gericht> gerichte = new ArrayList<>(maxAnzahlGerichte);
		
		Faker faker = new Faker();
		for(int i = 0; i < maxAnzahlGerichte; i++) {
			String bezeichnung = faker.food().dish();
			String randomPreis = faker.commerce().price(minPreisGericht, maxPreisGericht);
			Double preis = Double.valueOf(randomPreis.replace(',', '.'));
			Gericht randomGericht = new Gericht(bezeichnung, preis);
			gerichte.add(randomGericht);
		}
		
		return new MenuKarte(gerichte);
	}

}
