package com.caiopivetta6.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Register_tb")
public class RegisterClients implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Instant lastVisit;
	
	@OneToMany(mappedBy = "registerClients")
	private List<Client> clients = new ArrayList<>();
	
	@OneToMany(mappedBy = "registerClients")
	private List<Ristorant> ristorants;
	
	public RegisterClients() {
		
	}

	public RegisterClients(Integer id, Instant lastVisit) {
		super();
		this.id = id;
		this.lastVisit = lastVisit;
	}

	
	
	public List<Ristorant> getRistorants() {
		return ristorants;
	}

	public void setRistorants(List<Ristorant> ristorants) {
		this.ristorants = ristorants;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(Instant lastVisit) {
		this.lastVisit = lastVisit;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
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
		RegisterClients other = (RegisterClients) obj;
		return id == other.id;
	}
	
	
	
}
