package ar.com.plug.examen.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.plug.examen.app.api.ClientApi;
import ar.com.plug.examen.domain.repositories.ClientRepository;
import ar.com.plug.examen.domain.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientRepository clientRepository;
	

	@Override
	public ClientApi createClient(ClientApi clientApi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientApi getClient(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientApi> listAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeClient(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ClientApi updateClient(Long id, ClientApi clientApi) {
		// TODO Auto-generated method stub
		return null;
	}

}
