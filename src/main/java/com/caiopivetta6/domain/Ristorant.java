package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Ristorant implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registerClients_id", referencedColumnName = "id")
	private RegisterClients registerClients;

	
	public Ristorant() {
		
	}


	public Ristorant(Integer id, String name, RegisterClients registerClients) {
		super();
		this.id = id;
		this.name = name;
		this.registerClients = registerClients;
	}

	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
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
		return Objects.equals(id, other.id);
	}


	
	
	
	
	
}
