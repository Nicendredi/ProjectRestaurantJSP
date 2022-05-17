package model;

public interface Client {

	public int getIdClient();

	public void setIdClient(int idClient);

	public String getPassword();

	public void setPassword(String password);

	public String getfName();

	public void setfName(String fName);

	public String getName();

	public void setName(String name);

	public Adresse getAdresse();

	public void setAdresse(Adresse adresse);

	public Instructions getInstructions();

	public void setInstructions(Instructions instructions);

	public Telephone getTelephone();

	public void setTelephone(Telephone telephone);

}
