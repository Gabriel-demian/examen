package ar.com.plug.examen.domain.service;

import java.util.List;

import ar.com.plug.examen.app.api.ClientApi;

public interface ClientService {
	
	ClientApi createClient(ClientApi clientApi);

	ClientApi getClient(Long id);
	
	List<ClientApi> listAllClients();
	
	void removeClient(Long id);
	
	ClientApi updateClient(Long id, ClientApi clientApi);
	
}
