package model;

public class Adresse {
	private String adresse;

	public Adresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Adresse [");
		if (adresse != null) {
			builder.append("adresse=");
			builder.append(adresse);
		}
		builder.append("]");
		return builder.toString();
	}

}
