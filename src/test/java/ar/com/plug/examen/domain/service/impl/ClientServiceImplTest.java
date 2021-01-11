package ar.com.plug.examen.domain.service.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.com.plug.examen.Application;
import ar.com.plug.examen.app.api.ClientApi;
import ar.com.plug.examen.domain.repositories.ClientRepository;
import ar.com.plug.examen.domain.service.ClientService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ClientServiceImpl.class, ClientRepository.class})
@DataJpaTest
public class ClientServiceImplTest {
	
	@Autowired
	private ClientService clientService;
	
	@Test
	public void createClient() {
		
		ClientApi clientApi = new ClientApi();
		clientApi.setName("CreateTestName");
		
		ClientApi createdClient = clientService.createClient(clientApi);
		
		assertNotNull(createdClient);
		assertNotNull(createdClient.getId());
		
	}
	
	
	
	
}




















