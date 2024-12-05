package com.example.P3;

import com.example.P3.modelFila.RodarFila;
import com.example.P3.modelLista.RodarLista;
import com.example.P3.modelPilha.RodarPilha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P3Application {
	public static void main(String[] args) {
		SpringApplication.run(P3Application.class, args);
		RodarPilha p = new RodarPilha();
		RodarFila f = new RodarFila();
		RodarLista l = new RodarLista();
		//f.rodarFila();
		//p.rodarPilha();
		l.rodarLista();
	}
}
