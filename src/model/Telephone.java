package model;

public class Telephone {
	private String telephone;

	public Telephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telephone [");
		if (telephone != null) {
			builder.append("telephone=");
			builder.append(telephone);
		}
		builder.append("]");
		return builder.toString();
	}

}
