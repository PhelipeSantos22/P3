package com.example.P3.modelLista;

public class RodarLista {
    public void rodarLista(){
        Lista<Integer> lista = new Lista<>();
        try {
            // Verificando se a lista está vazia
            System.out.println("A lista está vazia? " + lista.isEmpty());

            // Adicionando elementos na lista
            System.out.println("Adicionando elementos...");
            lista.addFirst(10);  // Adiciona 10 no início
            lista.addLast(20);   // Adiciona 20 no final
            lista.add(15, 1);    // Adiciona 15 na posição 1
            lista.add(25, 3);    // Adiciona 25 na posição 3 (final)


            // Exibindo os elementos da lista
            System.out.println("Elementos da lista:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Elemento na posição " + i + ": " + lista.get(i));
            }

            // Verificando o tamanho da lista
            System.out.println("Tamanho da lista: " + lista.size());

            // Removendo o primeiro elemento
            System.out.println("Removendo o primeiro elemento...");
            lista.removeFirst();
            System.out.println("Tamanho após remover o primeiro: " + lista.size());

            // Removendo o último elemento
            System.out.println("Removendo o último elemento...");
            lista.removeLast();
            System.out.println("Tamanho após remover o último: " + lista.size());

            // Removendo um elemento de uma posição específica
            System.out.println("Removendo o elemento na posição 1...");
            lista.remove(1);
            System.out.println("Tamanho após remoção na posição 1: " + lista.size());

            // Exibindo a lista após as remoções
            System.out.println("Elementos restantes na lista:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Elemento na posição " + i + ": " + lista.get(i));
            }

            // Verificando novamente se a lista está vazia
            System.out.println("A lista está vazia? " + lista.isEmpty());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
