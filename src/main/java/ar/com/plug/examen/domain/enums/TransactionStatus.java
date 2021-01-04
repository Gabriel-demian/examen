package ar.com.plug.examen.domain.enums;

public enum TransactionStatus {
	
	
	PENDING("pnd"),
	APROVED("aprb");
	
	private String code;
	
	TransactionStatus(String code){
		this.code= code;
	}

	public String getCode() {
		return code;
	}
	
	
}
