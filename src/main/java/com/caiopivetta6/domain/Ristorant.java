package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

public class Ristorant implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	private RegisterClients registerClients;

	
	public Ristorant() {
		
	}


	public Ristorant(int id, String name, RegisterClients registerClients) {
		super();
		this.id = id;
		this.name = name;
		this.registerClients = registerClients;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public RegisterClients getRegisterClients() {
		return registerClients;
	}


	public void setRegisterClients(RegisterClients registerClients) {
		this.registerClients = registerClients;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ristorant other = (Ristorant) obj;
		return id == other.id;
	}
	
	
	
	
	
	
}