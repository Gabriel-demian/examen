package ar.com.plug.examen.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.plug.examen.app.api.ClientApi;
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

		Client client = clientRepository.save(clientMapper.fillEntity(new Client(), clientApi));
		
		log.severe("The client " + client.getId() +" was succesfully created.");
		
		return clientMapper.getDto(client);
	}  

	@Override
	public ClientApi getClient(Long id) {
		
		Client client = clientRepository.findById(id).orElse(null);
		
		return clientMapper.getDto(client);
	}

	@Override
	public List<ClientApi> listAllClients() {
		
		List<Client> client = clientRepository.findAll();
		
		return clientMapper.getDto(client);
	}

	@Override
	public void removeClient(Long id) {
		
		clientRepository.deleteById(id);
		
	}

	@Override
	public ClientApi updateClient(Long id, ClientApi clientApi) {
		
		Client client = clientRepository.save(clientMapper.fillEntity(new Client(), clientApi));
		
		return clientMapper.getDto(client);
	}

}
