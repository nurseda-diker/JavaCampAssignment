package nLayeredArchitecture.entities.concretes;

import nLayeredArchitecture.entities.abstracts.Entity;

public class User implements Entity {
	
	private String firstName;
	private String lastName;
	private String eposta;
	private String parola;
	
	public User() {}
	
	public User(String firstName, String lastName, String eposta, String parola) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.eposta = eposta;
		this.parola = parola;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEposta() {
		return eposta;
	}



	public void setEposta(String eposta) {
		this.eposta = eposta;
	}



	public String getParola() {
		return parola;
	}



	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
	
	
}
