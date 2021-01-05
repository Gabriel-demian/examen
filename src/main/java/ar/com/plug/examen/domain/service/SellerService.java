package ar.com.plug.examen.domain.service;

import java.util.List;

import ar.com.plug.examen.app.api.SellerApi;

public interface SellerService {
	
	SellerApi createSeller(SellerApi sellerApi);

	SellerApi getSeller(Long id);
	
	List<SellerApi> listAllSellers();
	
	void removeSeller(Long id);
	
	SellerApi updateSeller(Long id, SellerApi sellerApi);

}
