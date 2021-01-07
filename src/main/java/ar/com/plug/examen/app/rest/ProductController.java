package ar.com.plug.examen.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.plug.examen.domain.service.ProductService;

@RestController
@RequestMapping(path="/product", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {
	
	@Autowired
	private ProductService productService;

}
