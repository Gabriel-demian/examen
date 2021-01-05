package ar.com.plug.examen.domain.service;

import java.util.List;

import ar.com.plug.examen.app.api.TransactionApi;

public interface TransactionService {
	
	TransactionApi createTransaction(TransactionApi transactionApi);

	TransactionApi getTransaction(Long id);
	
	List<TransactionApi> listAllTransactions(Long sellerId);
	
	TransactionApi approveTransaction(Long id, String validation);
	
}
