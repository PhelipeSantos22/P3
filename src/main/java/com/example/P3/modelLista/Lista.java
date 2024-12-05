package com.example.P3.modelLista;

public class Lista<T> {

    No<T> primeiro;

    public Lista() {
        primeiro = null;
    }

    // Verifica se a lista está vazia
    public boolean isEmpty() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    // retorna a quantidade de elementos da lista
    public int size() {
        int cont = 0;
        if (!isEmpty()) {
            No<T> auxiliar = primeiro;
            while (auxiliar != null) {
                cont++;
                auxiliar = auxiliar.proximo;
            }
        }
        return cont;
    }

    private No<T> getNo(int pos) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista Vazia");
        }
        int tamanho = size();
        if (pos < 0 || pos > tamanho - 1) {
            throw new Exception("Posição Invalida");
        }
        int cont = 0;
        No<T> auxiliar = primeiro;
        while (cont < pos) {
            cont++;
            auxiliar = auxiliar.proximo;
        }
        return auxiliar;
    }

    // adiciona um elemento na posição 0 se ja tiver um elemento na posição 0 ele passa a ser 1
    public void addFirst(T valor) {
        No<T> elemento = new No<>();
        elemento.dado = valor;
        elemento.proximo = primeiro;
        primeiro = elemento;
    }

    // adiciona um elemento no fim da lista se ja tiver um elemento no fim da lista este elemento vira o penultimo
    public void addLast(T valor) throws Exception {
        if (isEmpty()) {
//			throw new Exception("Lista Vazia");
            addFirst(valor);
        }
        int tamanho = size();
        No<T> elemento = new No<>();
        elemento.dado = valor;
        elemento.proximo = null;
        No<T> ultimo = getNo(tamanho - 1);
        ultimo.proximo = elemento;
    }

    // adiciona um elemento na poisção desejada se ja tiver algum nesta posição ele é empurrado para proxima posição
    public void add(T valor, int pos) throws Exception {
        int tamanho = size();
        if (pos < 0 || pos > tamanho) {
            throw new Exception("Posição Invalida");
        }
        if (pos == 0) {
            addFirst(valor);
        } else if (pos == tamanho) {
            addLast(valor);
        } else {
            No<T> anterior = getNo(pos - 1);
            No<T> elemento = new No<>();
            elemento.dado = valor;
            elemento.proximo = anterior.proximo;
            anterior.proximo = elemento;
        }
    }

    // remove o primeiro elemento
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista Vazia");
        }
        primeiro = primeiro.proximo;
    }

    // remove o ultimo elemento
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista Vazia");
        }
        int tamanho = size();
        if (tamanho == 1) {
            removeFirst();
        } else {
            No<T> penultimo = getNo(tamanho - 2);
            penultimo.proximo = null;
        }
    }

    // remove o elemento da posição desejada o elemento posterio toma o seu lugar
    public void remove(int pos) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista Vazia");
        }
        int tamanho = size();
        if (pos < 0 || pos > tamanho - 1) {
            throw new Exception("Posição Invalida");
        }
        if (pos == 0) {
            removeFirst();
        } else if (pos == tamanho - 1) {
            removeLast();
        } else {
            No<T> anterior = getNo(pos - 1);
            No<T> atual = getNo(pos);
            anterior.proximo = atual.proximo;
        }
    }

    // mostra um elemento da posição desejada
    public T get(int pos) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista Vazia");
        }
        int tamanho = size();
        if (pos < 0 || pos > tamanho - 1) {
            throw new Exception("Posição Invalida");
        }
        No<T> auxiliar = getNo(pos);
        return auxiliar.dado;
    }
}