package restaurants.model;

import org.apache.commons.lang3.StringUtils;

public class AnschriftBuilder {

	private Anschrift anschrift;

	public static AnschriftBuilder getInstance() {
		return new AnschriftBuilder();
	}

	private AnschriftBuilder() {
		anschrift = new Anschrift();
	}

	public AnschriftBuilder self() {
		anschrift.setLandIsoCode("DE");
		return this;
	}

	public AnschriftBuilder strasse(final String str) {
		if (StringUtils.isNotEmpty(str) && StringUtils.length(str) < 200) {
			anschrift.setStrasse(str);
		}
		return this;
	}

	public AnschriftBuilder hnr(final String hnr) {
		if (StringUtils.isNotEmpty(hnr) && !StringUtils.isAlpha(hnr) && StringUtils.length(hnr) < 5) {
			anschrift.setHnr(hnr);
		}
		return this;
	}

	public AnschriftBuilder stadtTeil(final String stadtTeil) {
		if (StringUtils.isNotEmpty(stadtTeil)) {
			anschrift.setStadtTeil(stadtTeil);
		}
		return this;
	}

	public AnschriftBuilder plz(final String plz) {
		if (StringUtils.isNotEmpty(plz) && StringUtils.isNumeric(plz) && StringUtils.length(plz) == 5) {
			anschrift.setPlz(plz);
		}
		return this;
	}

	public AnschriftBuilder ort(final String ort) {
		if (StringUtils.isNotEmpty(ort) && StringUtils.length(ort) < 120) {
			anschrift.setOrt(ort);
		}
		return this;
	}

	public Anschrift build() {
		return this.anschrift;
	}

}