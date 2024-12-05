package com.example.P3.modelFila;

public class RodarFila {
    public void rodarFila() {
        Fila<Integer> fila = new Fila<>();
        try {
            // Verificando se a fila está vazia
            System.out.println("A fila está vazia? " + fila.isEmpty());

            // Inserindo elementos na fila
            System.out.println("Inserindo elementos...");
            fila.insert(10);
            fila.insert(20);
            fila.insert(30);
            fila.insert(40);

            // Exibindo os elementos da fila
            System.out.println("Elementos na fila:");
            fila.list();

            // Exibindo o tamanho da fila
            System.out.println("Tamanho da fila: " + fila.size());

            // Removendo dois elementos da fila
            System.out.println("Removendo elementos...");
            System.out.println("Elemento removido: " + fila.remove());
            System.out.println("Elemento removido: " + fila.remove());

            // Exibindo os elementos restantes da fila
            System.out.println("Elementos restantes na fila:");
            fila.list();

            // Exibindo o tamanho da fila após as remoções
            System.out.println("Tamanho da fila após remoções: " + fila.size());

            // Verificando novamente se a fila está vazia
            System.out.println("A fila está vazia? " + fila.isEmpty());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
