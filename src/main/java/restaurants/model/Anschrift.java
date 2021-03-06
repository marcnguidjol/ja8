package restaurants.model;

public class Anschrift {

	private String strasse;
	private String hnr;
	private String stadtTeil;
	private String plz;
	private String ort;
	private String landIsoCode;

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHnr() {
		return hnr;
	}

	public void setHnr(String hnr) {
		this.hnr = hnr;
	}

	public String getStadtTeil() {
		return stadtTeil;
	}

	public void setStadtTeil(String stadtTeil) {
		this.stadtTeil = stadtTeil;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getLandIsoCode() {
		return landIsoCode;
	}

	public void setLandIsoCode(String landIsoCode) {
		this.landIsoCode = landIsoCode;
	}

	@Override
	public String toString() {
		return "Anschrift [strasse=" + strasse + ", hnr=" + hnr + ", stadtTeil=" + stadtTeil + ", plz=" + plz + ", ort="
				+ ort + ", landIsoCode=" + landIsoCode + "]";
	}

}
