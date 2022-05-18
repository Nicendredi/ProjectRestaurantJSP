package model;

public class ClientV1 implements Client {

	private int idClient;
	private String password;
	private String fName;
	private String name;
	private Adresse adresse;
	private Instructions instructions;
	private Telephone telephone;

	public ClientV1() {
		this.idClient = -1;
		this.password = "";
		this.fName = "";
		this.name = "";
		this.adresse = new Adresse("");
		this.instructions = new Instructions("");
		this.telephone = new Telephone("");
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Instructions getInstructions() {
		return instructions;
	}

	public void setInstructions(Instructions instructions) {
		this.instructions = instructions;
	}

	public Telephone getTelephone() {
		return telephone;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientV1 [idClient=");
		builder.append(idClient);
		builder.append(", ");
		if (password != null) {
			builder.append("password=");
			builder.append(password);
			builder.append(", ");
		}
		if (fName != null) {
			builder.append("fName=");
			builder.append(fName);
			builder.append(", ");
		}
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		if (adresse != null) {
			builder.append("adresse=");
			builder.append(adresse);
			builder.append(", ");
		}
		if (instructions != null) {
			builder.append("instructions=");
			builder.append(instructions);
			builder.append(", ");
		}
		if (telephone != null) {
			builder.append("telephone=");
			builder.append(telephone);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idClient;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientV1 other = (ClientV1) obj;
		if (idClient != other.idClient)
			return false;
		if (other.password == null)
			return false;
		if (!password.equals(other.password))
			return false;
		return true;
	}

}
