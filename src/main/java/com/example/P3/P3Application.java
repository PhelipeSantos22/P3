package com.example.P3;

import com.example.P3.modelFila.Fila;
import com.example.P3.modelFila.RodarFila;
import com.example.P3.modelLista.Lista;
import com.example.P3.modelLista.RodarLista;
import com.example.P3.modelPilha.Pilha;
import com.example.P3.modelPilha.RodarPilha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P3Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(P3Application.class, args);
		Fila<Integer> f = new Fila<>();
		Pilha<Integer> p = new Pilha<>();
		Lista<Integer> l = new Lista();
		//RodarPilha p = new RodarPilha();
		//RodarFila f = new RodarFila();
		//RodarLista l = new RodarLista();
		//f.rodarFila();
		//p.rodarPilha();
		//l.rodarLista();

		/**
		int[] vetor = {145,285,220,172,204,149,112,2,96,29,180,271,290,121,117,221,126};
		for(int i : vetor){
			if (i % 2 == 1){
				p.push(i);
			}else {
				if (!p.isEmpty()){
					int valor = p.pop() + i;
					System.out.println(valor);
				}
			}
		}**/

		int[] vetor = {42,46,16,-9,48,20,35,37,11,44,43,12,20,48,45,45,31,21,47,4,20,42,44,-7,3,36};
		for(int i : vetor){
			if (l.isEmpty()){
				l.addFirst(i * 2);
			} else if (l.size() == 1) {
				l.addFirst(i);
			} else if (i < 0) {
				l.addLast(i);
			} else if (i % 3 == 0) {
				l.add(i / 3, 1);
			}else {
				l.add(i * i , 1);
			}
		}
		int tamanho = l.size();
		while(!l.isEmpty()){
			if(tamanho == 1){
				System.out.println(l.get(0));
				l.removeFirst();
			} else if (tamanho > 10) {
				System.out.println(l.get(0));
				l.removeFirst();
			} else {
				System.out.println(l.get(tamanho - 1));
				l.removeLast();
			}
			tamanho = l.size();
		}
	}
}
