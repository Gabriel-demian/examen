package ar.com.plug.examen.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.plug.examen.app.api.TransactionApi;
import ar.com.plug.examen.domain.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Override
	public TransactionApi createTransaction(TransactionApi transactionApi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionApi getTransaction(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionApi> listAllTransactions(Long sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionApi approveTransaction(Long id, String validation) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
