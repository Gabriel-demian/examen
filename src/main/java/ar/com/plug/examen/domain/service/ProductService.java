package ar.com.plug.examen.domain.service;

import java.util.List;

import ar.com.plug.examen.app.api.ProductApi;

public interface ProductService {
	
	ProductApi createProduct(ProductApi productApi);

	ProductApi getProduct(Long id);
	
	List<ProductApi> listAllProducts();
	
	void removeProduct(Long id);
	
	ProductApi updateProduct(Long id, ProductApi productApi);

}
