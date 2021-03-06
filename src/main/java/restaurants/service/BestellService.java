package restaurants.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import restaurants.model.Bestellung;
import restaurants.model.Restaurant;

public class BestellService {

	static Logger LOG = Logger.getLogger(BestellService.class.getSimpleName());
	
	public double bestelle(final Restaurant restaurant, final Bestellung bestellung) {
		if (null == restaurant || null == bestellung) {
			return 0.0;
		}
		final double betrag = bestellung.getGesamtPreis();
		LOG.log(Level.INFO, "--- Gesamtpreis Bestellung {0} EUR ---", betrag);
		
		return betrag;
	}

}
