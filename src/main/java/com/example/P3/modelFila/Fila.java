package com.example.P3.modelFila;

public class Fila<T> {

    No<T> inicio;
    No<T> fim;

    public Fila() {
        inicio = null;
        fim = null;
    }
    // Verifica se a fila está vazia
    public boolean isEmpty() {
        if (inicio == fim && inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    // inserir um elemento no final da fila
    public void insert(T valor) {
        No<T> elemento = new No<>();
        elemento.dado = valor;
        elemento.proximo = null;
        // Verificar se é o primeiro dado
        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
        } else {
            fim.proximo = elemento;
            fim = elemento;
        }
    }

    //Lista os elementos da fila começando pelo primeiro que entrou
    public void list() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila Vazia");
        }
        No<T> auxiliar = inicio;

        while (auxiliar != null) {
            System.out.println(auxiliar.dado);
            auxiliar = auxiliar.proximo;
        }
    }

    // remove o primeiro elemento da fila
    public T remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila Vazia");
        }
        No<T> auxiliar = inicio;
        if (inicio == fim && inicio != null) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
        }

        return auxiliar.dado;
    }

    // retorna a quantidade de elemementos que tem em uma fila
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int cont = 0;
            No<T> auxiliar = inicio;
            while (auxiliar != null) {
                cont++;
                auxiliar = auxiliar.proximo;
            }
            return cont;
        }
    }

}