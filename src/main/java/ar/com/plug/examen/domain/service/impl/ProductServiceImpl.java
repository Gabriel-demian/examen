package ar.com.plug.examen.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.plug.examen.app.api.ProductApi;
import ar.com.plug.examen.domain.service.ProductService;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public ProductApi createProduct(ProductApi productApi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductApi getProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductApi> listAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductApi updateProduct(Long id, ProductApi productApi) {
		// TODO Auto-generated method stub
		return null;
	}

}
