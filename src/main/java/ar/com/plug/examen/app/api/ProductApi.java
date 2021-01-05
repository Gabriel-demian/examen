package ar.com.plug.examen.app.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;

@JsonRootName(value = "product")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class ProductApi {

}
