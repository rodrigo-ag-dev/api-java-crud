package br.com.crud.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info = @Info(
					title = "JAVA API - CRUD",
					version = "0.1",
					description = "About me",
					// license = @License(name = "Apache 2.0", url = "http://foo.bar"),
					contact = @Contact( url = "https://www.linkedin.com/in/rodrigo-alexandre-goncalves/", 
					                    name = "Rodrigo Alexandre Gonçalves", 
															email = "rodrigo.ag.dev@gmail.com"
													  )
	),
	externalDocs = @ExternalDocumentation(description = "definition docs desc")	
)

@SpringBootApplication
public class CrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
}