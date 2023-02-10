package com.caiopivetta6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.Client;
import com.caiopivetta6.domain.RegisterClients;
import com.caiopivetta6.domain.Ristorant;
import com.caiopivetta6.repositories.ClientRepository;
import com.caiopivetta6.repositories.RegisterClientRepository;
import com.caiopivetta6.repositories.RistorantRepository;

@SpringBootApplication
public class RistorantRegisterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RistorantRegisterApplication.class, args);
	}

	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private RegisterClientRepository registerClientRepository;
	
	@Autowired
	private RistorantRepository ristorantRepository;
	
	@Override
	public void run(String... args) throws Exception, ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Client client1 = new Client(null, "Roberto Carlos", "carlos@gmail.com", "3412341234");
		Client client2 = new Client(null, "Clarisse Spector", "clair@gmail.com", "3412314132");
		Client client3 = new Client(null, "Claudio Blum", "claudio@gmail.com", "3122214132");
		Client client4 = new Client(null, "Luck Rockhold", "luck@gmail.com", "3412314132");
		
		
		RegisterClients registerClients1 = new RegisterClients(null, sdf.parse("22/02/2023").toInstant());
		registerClients1.getClients().addAll(Arrays.asList(client1, client2));
		
		RegisterClients registerClients2 = new RegisterClients(null, sdf.parse("22/02/2023").toInstant());
		registerClients2.getClients().addAll(Arrays.asList(client3, client4));
		
		
		Ristorant ristorant = new Ristorant(null, "Ristorant 3 marchetti", registerClients1);
		
		
		//Ristorant ristorant = new Ristorant(null, "Ristorant Porto Sicuro", );
		
		
		
	}

}
