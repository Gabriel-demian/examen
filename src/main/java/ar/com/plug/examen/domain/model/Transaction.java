package ar.com.plug.examen.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ar.com.plug.examen.domain.enums.TransactionStatus;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private Long productId;
	@Column
	private Long clientId;
	@Column
	private Long sellerId;
	@Column
	private Double price;
	@Column
	private String status = TransactionStatus.PENDING.getCode();
	@Column
	private LocalDateTime date;
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", productId=" + productId + ", clientId=" + clientId + ", sellerId="
				+ sellerId + ", price=" + price + ", status=" + status + ", date=" + date + "]";
	}
	
	
}
