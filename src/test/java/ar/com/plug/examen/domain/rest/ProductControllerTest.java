package ar.com.plug.examen.domain.rest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;

import ar.com.plug.examen.Application;
import ar.com.plug.examen.app.api.ProductApi;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = Application.class)
public class ProductControllerTest {
	
	@Autowired
    private TestRestTemplate testRestTemplate;
    private final String URL = "/product";
    
    @Autowired
    WebApplicationContext webApplicationContext;
	
    
    @Test
    public void createProduct() {
    	ProductApi productApi = new ProductApi();
    	
    	productApi.setName("test Name");
    	productApi.setPrice(123.80);
    	productApi.setDescription("This is a test product!");
    	
    	ResponseEntity<ProductApi> response = testRestTemplate.postForEntity(URL, productApi, ProductApi.class);
    	
    	System.out.println("ACAAAAA!!!   **************        " +  response.getStatusCode() + " --- " + response.getBody());
    	assertEquals(HttpStatus.CREATED, response.getStatusCode());
    	assertEquals(productApi.getName(), response.getBody().getId());
    }
    
    @Test
    public void getProduct()  throws Exception {
    	
    	ProductApi productApi = new ProductApi();
    	
    	productApi.setName("test Name");
    	productApi.setPrice(123.80);
    	productApi.setDescription("This is a test product!");
    	
    	ResponseEntity<ProductApi> response = testRestTemplate.postForEntity(URL, productApi, ProductApi.class);
    	assertEquals(HttpStatus.CREATED, response.getStatusCode());
    	

        ResponseEntity<ProductApi> responseEntity = testRestTemplate.getForEntity(URL + "/" + response.getBody().getId(), ProductApi.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(productApi.getName(), responseEntity.getBody().getName());
    }
    
    @Test
    public void listAllProducts()  throws Exception {
    	
    	ProductApi productApi1 = new ProductApi();
    	
    	productApi1.setName("test Name Prod 1");
    	productApi1.setPrice(123.80);
    	productApi1.setDescription("This is a test product 1!");
    	
    	ResponseEntity<ProductApi> response1 = testRestTemplate.postForEntity(URL, productApi1, ProductApi.class);
    	assertEquals(HttpStatus.CREATED, response1.getStatusCode());
    	
    	ProductApi productApi2 = new ProductApi();
    	
    	productApi2.setName("test Name Prod 2");
    	productApi2.setPrice(123.80);
    	productApi2.setDescription("This is a test product 2!");
    	
    	ResponseEntity<ProductApi> response2 = testRestTemplate.postForEntity(URL, productApi2, ProductApi.class);
    	assertEquals(HttpStatus.CREATED, response2.getStatusCode());
    	
    	
        ResponseEntity<List> responseEntity = testRestTemplate.getForEntity(URL, List.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
    
    @Test
    public void removeProduct() throws Exception {
    	
    	ProductApi productApi = new ProductApi();
    	
    	productApi.setName("test Name");
    	productApi.setPrice(123.80);
    	productApi.setDescription("This is a test product!");
    	
    	ResponseEntity<ProductApi> response = testRestTemplate.postForEntity(URL, productApi, ProductApi.class);
    	assertEquals(HttpStatus.CREATED, response.getStatusCode());
    	
    	ResponseEntity<ProductApi> responseEntity = testRestTemplate.exchange(URL + "/" + response.getBody().getId(), 
    			HttpMethod.DELETE, new HttpEntity<>(productApi), ProductApi.class);
    	
    	assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
    
    @Test
    public void updateProduct() throws Exception {
    	ProductApi productApi = new ProductApi();
    	
    	productApi.setId(1L);
    	productApi.setName("test Name");
    	productApi.setPrice(123.80);
    	productApi.setDescription("This is a test product!");
    	
    	ResponseEntity<ProductApi> response = testRestTemplate.postForEntity(URL, productApi, ProductApi.class);
    	assertEquals(HttpStatus.CREATED, response.getStatusCode());
    	
    	ResponseEntity<ProductApi> responseEntity = testRestTemplate.exchange(URL + "/" + response.getBody().getId(),
                HttpMethod.PUT,
                new HttpEntity<>(productApi),
                ProductApi.class);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals(productApi.getName(), responseEntity.getBody().getName());
    	
    }
    
	
	
	
	
	
	
	
}
















