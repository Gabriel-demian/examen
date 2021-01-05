package ar.com.plug.examen.domain.mappers;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.com.plug.examen.app.api.SellerApi;
import ar.com.plug.examen.domain.model.Seller;

@Component
public class SellerMapper implements Mapper<Seller, SellerApi>{

	@Override
	public SellerApi getDto(Seller entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller fillEntity(Seller entity, SellerApi dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SellerApi> getDto(Collection<Seller> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}
