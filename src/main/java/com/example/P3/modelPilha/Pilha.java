package com.example.P3.modelPilha;

public class Pilha<T> {

    No<T> topo;

    public Pilha() {
        topo = null;
    }

    // Verifica se a pilha esta vazia
    public boolean isEmpty() {
        if (topo == null) {
            return true;
        } else {
            return false;
        }
    }

    // inseri no topo da pilha um novo elemento
    public void push(T valor) {
        No<T> elemento = new No<>();
        elemento.dado = valor;
        elemento.proximo = topo;
        topo = elemento;
    }

    // remove e retorna um elemento do topo da pilha
    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pilha Vazia");
        }
        T valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    // Retorna o elemento que está no topo da pilha
    public T top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pilha Vazia");
        }
        T valor = topo.dado;
        return valor;
    }

    // retorna a quantidade de elementos que tem na pilha
    public int size() {
        int cont = 0;
        if (!isEmpty()) {
            No aux = topo;
            while (aux != null) {
                cont++;
                aux = aux.proximo;
            }
        }
        return cont;
    }

}