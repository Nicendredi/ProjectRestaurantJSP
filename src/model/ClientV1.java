package model;

public class ClientV1 implements Client {

	private int idClient;
	private String password;
	private String fName;
	private String name;
	private Adresse adresse;
	private Instructions instructions;
	private Telephone telephone;

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
		return "ImplementClient [adresse=" + adresse + ", fName=" + fName + ", idClient=" + idClient + ", instructions="
				+ instructions + ", name=" + name + ", password=" + password + ", telephone=" + telephone + "]";
	}

}
