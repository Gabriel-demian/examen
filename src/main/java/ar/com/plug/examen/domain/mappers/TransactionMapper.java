package ar.com.plug.examen.domain.mappers;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.com.plug.examen.app.api.TransactionApi;
import ar.com.plug.examen.domain.model.Transaction;

@Component
public class TransactionMapper implements Mapper<Transaction, TransactionApi>{

	@Override
	public TransactionApi getDto(Transaction entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction fillEntity(Transaction entity, TransactionApi dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionApi> getDto(Collection<Transaction> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}
