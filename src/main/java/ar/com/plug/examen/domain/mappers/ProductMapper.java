package ar.com.plug.examen.domain.mappers;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.com.plug.examen.app.api.ProductApi;
import ar.com.plug.examen.domain.model.Product;

@Component
public class ProductMapper implements Mapper<Product, ProductApi>{

	@Override
	public ProductApi getDto(Product entity) {
		return null;
	}

	@Override
	public Product fillEntity(Product entity, ProductApi dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductApi> getDto(Collection<Product> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}
