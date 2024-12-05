package com.example.P3.modelPilha;

public class RodarPilha {
    public void rodarPilha(){
        Pilha<Integer> pilha = new Pilha<>();
        try {
            // Verificando se a pilha está vazia
            System.out.println("A pilha está vazia? " + pilha.isEmpty());

            // Inserindo elementos na pilha (push)
            System.out.println("Inserindo elementos...");
            pilha.push(10);
            pilha.push(20);
            pilha.push(30);
            pilha.push(40);

            // Exibindo o topo da pilha (top)
            System.out.println("Topo da pilha: " + pilha.top());

            // Exibindo o tamanho da pilha (size)
            System.out.println("Tamanho da pilha: " + pilha.size());

            // Removendo elementos da pilha (pop)
            System.out.println("Removendo elementos...");
            System.out.println("Elemento removido: " + pilha.pop());
            System.out.println("Elemento removido: " + pilha.pop());

            // Exibindo o topo após remoções
            System.out.println("Topo da pilha após remoções: " + pilha.top());

            // Exibindo o tamanho da pilha após as remoções
            System.out.println("Tamanho da pilha após remoções: " + pilha.size());

            // Verificando novamente se a pilha está vazia
            System.out.println("A pilha está vazia? " + pilha.isEmpty());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
