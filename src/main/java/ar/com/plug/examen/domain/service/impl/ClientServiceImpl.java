package ar.com.plug.examen.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.plug.examen.app.api.ClientApi;
import ar.com.plug.examen.domain.execptions.BadRequestException;
import ar.com.plug.examen.domain.execptions.NotFoundException;
import ar.com.plug.examen.domain.mappers.ClientMapper;
import ar.com.plug.examen.domain.model.Client;
import ar.com.plug.examen.domain.repositories.ClientRepository;
import ar.com.plug.examen.domain.service.ClientService;
import lombok.extern.java.Log;

@Log
@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ClientMapper clientMapper;

	
	@Override
	public ClientApi createClient(ClientApi clientApi) {
		
		if(!clientApi.getName().isBlank()) {
			log.severe("The name is required for the creation of the client. ");
			throw new BadRequestException("Mandatory data is missing: name");
		}

		Client client = clientRepository.save(clientMapper.fillEntity(new Client(), clientApi));
		
		log.severe("The client " + client.getId() +" was succesfully created.");
		
		return clientMapper.getDto(client);
	}  

	@Override
	public ClientApi getClient(Long id) {
		
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Client with the id: " + id + " was not found."));
		
		return clientMapper.getDto(client);
	}

	@Override
	public List<ClientApi> listAllClients() {
		
		List<Client> client = clientRepository.findAll();
		
		return clientMapper.getDto(client);
	}

	@Override
	public void removeClient(Long id) {
		
		if(!clientRepository.existsById(id)) {
			log.severe("The cliente with the id:" + id + " does not exist.");
			throw new NotFoundException("client with id " + id + " does not exist");
		}
		
		clientRepository.deleteById(id);
		
	}

	@Override
	public ClientApi updateClient(Long id, ClientApi clientApi) {
		
		if(!clientRepository.existsById(id)) {
			log.severe("The cliente with the id:" + id + " does not exist.");
			throw new NotFoundException("client with id " + id + " does not exist");
		}else if(!clientApi.getName().isBlank()) {
			log.severe("The name is required for the creation of the client. ");
			throw new BadRequestException("Mandatory data is missing: name");
		} 
		
		Client client = clientRepository.save(clientMapper.fillEntity(new Client(), clientApi));
		
		log.severe("The client " + client.getId() +" was succesfully updated.");
		
		return clientMapper.getDto(client);
	}

}
