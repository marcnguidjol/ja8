package restaurants.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import restaurants.model.Anschrift;
import restaurants.model.AnschriftBuilder;
import restaurants.model.Restaurant;

public class RestaurantRepository {

	static Logger LOG = Logger.getLogger(RestaurantRepository.class.getSimpleName());
	
	private List<Restaurant> lieferServices;

	public RestaurantRepository() {
		this.lieferServices = new ArrayList<>();
	}

	public void addRestaurant(final String name, final String str, final String hnr, final String stadtTeil,
			final String plz, final String ort) {

		Anschrift anschrift = AnschriftBuilder.getInstance()
				.self()
				.strasse(str)
				.hnr(hnr)
				.stadtTeil(stadtTeil)
				.plz(plz)
				.ort(ort)
				.build();

		lieferServices.add(new Restaurant(name, anschrift));
		
		LOG.log(Level.INFO, "--- Lieferservices {0} ---", lieferServices);
	}

	public List<Restaurant> getLieferServices() {
		return lieferServices;
	}

}
