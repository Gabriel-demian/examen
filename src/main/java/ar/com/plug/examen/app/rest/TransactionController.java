package ar.com.plug.examen.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.plug.examen.app.api.TransactionApi;
import ar.com.plug.examen.domain.service.TransactionService;


@RestController
@RequestMapping(path="/transaction", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	/**
	 * Create a new Transaction.
	 * @param TransactionApi
	 * @return ResponseEntity<TransactionApi>
	 */
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<TransactionApi> createTransaction(@RequestBody TransactionApi TransactionApi){
		
		return new ResponseEntity<>(transactionService.createTransaction(TransactionApi), HttpStatus.CREATED);
		
	}
	
	/**
	 * Get a transaction searching by the transaction id.
	 * @param Transaction id
	 * @return ResponseEntity<TransactionApi>
	 */
	@GetMapping(path = "/{id}")
	public ResponseEntity<TransactionApi> getTransaction(Long id){
		
		return new ResponseEntity<>(transactionService.getTransactionById(id), HttpStatus.OK);
		
	}
	
	/**
	 * List all the transactions. 
	 * @return ResponseEntity<List<TransactionApi>>
	 */
	@GetMapping()
	public ResponseEntity<List<TransactionApi>> listAllTransactions(){
		
		return new ResponseEntity<>(transactionService.listAllTransactions(), HttpStatus.OK);
		
	}
	
	/**
	 * This method will update the transaction status.
	 * @param Transaction id
	 * @param validation
	 * @return ResponseEntity<TransactionApi>
	 */
	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionApi> updateTransaction(@RequestParam Long id, @RequestBody String validation){
		
		return new ResponseEntity<>(transactionService.approveTransaction(id, validation), HttpStatus.CREATED);
		
	}
	
}
