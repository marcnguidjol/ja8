package office;

import java.util.List;
import java.util.Random;

import restaurants.dao.RestaurantRepository;
import restaurants.model.Bestellung;
import restaurants.model.MenuKarte;
import restaurants.model.Restaurant;
import restaurants.service.BestellService;
import restaurants.util.MenuKarteRandomGeneratorUtil;

public class OfficeMain {

	public static void main(String[] args) {
		
		RestaurantRepository restaurantRepository = new RestaurantRepository();
		restaurantRepository.addRestaurant("ja8-tkcs-restaurant", "Gropiusstrasse", "7", null, "12345", "Muenster");
		
		List<Restaurant> lieferServices = restaurantRepository.getLieferServices();
		Restaurant auswahl = lieferServices.get(new Random().nextInt(lieferServices.size()));
		
		Bestellung bestellung = new Bestellung();
		MenuKarte menuKarte = MenuKarteRandomGeneratorUtil.erzeugeMenuKarte(10, 6.0d, 20.0d);
		bestellung.setAuswahl(menuKarte.getMenues().subList(0, 3));
		
		BestellService bestellService = new BestellService();
		bestellService.bestelle(auswahl, bestellung);
		
	}

}
