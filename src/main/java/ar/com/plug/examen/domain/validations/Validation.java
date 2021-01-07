package ar.com.plug.examen.domain.validations;

import ar.com.plug.examen.app.api.ClientApi;
import ar.com.plug.examen.app.api.ProductApi;
import ar.com.plug.examen.app.api.SellerApi;
import ar.com.plug.examen.app.api.TransactionApi;

public class Validation {
	
	public PairResult validateProduct(ProductApi product) {
		
		String leyend = "";
		boolean valid = true;
		
		if(product.getName().isBlank()) {
			leyend = "The name is required, ";
			valid = false;
		}else if(product.getPrice().isNaN()) {
			leyend = leyend + "The price is required or must be a number, ";
			valid = false;
		}else if(product.getDescription().isBlank()) {
			leyend = leyend + "The description is required.";
			valid = false;
		}
		
		return new PairResult(valid, leyend);
	}
	
	public PairResult validateClient(ClientApi client) {
		String leyend = "";
		boolean valid = true;
		
		if(client.getName().isBlank()) {
			leyend = "The name is required. ";
			valid = false;
		}
		
		return new PairResult(valid, leyend);
	}
	
	public String validateSeller(SellerApi seller) {
		String leyend = "";
		
		if(seller.getName().isBlank()) {
			leyend = "The name is required. ";
		}
		
		return leyend;
	}
	
	public PairResult validateTransaction(TransactionApi transaction) {
		
		String leyend = "";
		boolean valid = true;
		
		if(transaction.getClientId() != null) {
			leyend = "The client id is required, ";
			valid = false;
		}else if(transaction.getPrice().isNaN()) {
			leyend = leyend + "The price is required or must be a number, ";
			valid = false;
		}else if(transaction.getProductId() != null) {
			leyend = leyend + "The product id is required, ";
			valid = false;
		}else if(transaction.getSellerId() != null) {
			leyend = leyend + "The seller id is required, ";
			valid = false;
		}else if(transaction.getStatus().isBlank()) {
			leyend = leyend + "The status is required";
			valid = false;
		}
		
		return new PairResult(valid, leyend);
	}
	
}

















