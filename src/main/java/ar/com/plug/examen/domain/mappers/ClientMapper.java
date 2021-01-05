package ar.com.plug.examen.domain.mappers;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.com.plug.examen.app.api.ClientApi;
import ar.com.plug.examen.domain.model.Client;

@Component
public class ClientMapper implements Mapper<Client, ClientApi>{

	@Override
	public ClientApi getDto(Client entity) {
		
		ClientApi dto = new ClientApi();
		
		
		return null;
		
	}

	@Override
	public Client fillEntity(Client entity, ClientApi dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientApi> getDto(Collection<Client> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}
