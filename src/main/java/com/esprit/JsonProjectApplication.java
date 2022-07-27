package com.esprit;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.esprit.entities.Classe;
import com.esprit.entities.Projet;
import com.esprit.entities.Projets;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;




@SpringBootApplication
public class JsonProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonProjectApplication.class, args);
		
		
	}

}
