package ar.com.plug.examen.app.api;


import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName(value = "client")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class ClientApi implements Serializable{
	
	@NotNull
	private Long id;
	@NotNull
	private String name;
	
	@Override
	public String toString() {
		return "ClientApi [id=" + id + ", name=" + name + "]";
	}
	
}
