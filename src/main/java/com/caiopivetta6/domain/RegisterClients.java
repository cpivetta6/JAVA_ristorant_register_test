package com.caiopivetta6.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RegisterClients implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private Instant lastVisit;
	
	private List<Client> clients = new ArrayList<>();
	
	public RegisterClients() {
		
	}

	public RegisterClients(int id, Instant lastVisit) {
		super();
		this.id = id;
		this.lastVisit = lastVisit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
