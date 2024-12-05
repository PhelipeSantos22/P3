package com.example.P3.modelArvore;

public class Arvore {
    No raiz;

    public Arvore(){
        raiz = null;
    }

    private void insert(No no,No raizSubArvore){
        if(raiz==null){
            raiz=no;
        }else {
            if (no.dado < raizSubArvore.dado) {
                if (raizSubArvore.esqurda == null){
                    raizSubArvore.esqurda = no;
                } else {
                    insert(no,raizSubArvore.esqurda);
                }
            }
            if (no.dado >= raizSubArvore.dado) {
                if (raizSubArvore.direita == null){
                    raizSubArvore.direita = no;
                }else{
                    insert(no,raizSubArvore.direita);
                }
            }
        }
    }

    public void insertleaf(int dado){
        No no = new No();
        no.dado = dado;
        no.direita = null;
        no.esqurda = null;
        insert(no,raiz);
    }

    private void postfix(No raizSubArvore) throws Exception {
        if (raiz == null){
            throw new Exception("Arvore vazia");
        }else {
            if (raizSubArvore.esqurda != null){
                postfix(raizSubArvore.esqurda);
            }
            if (raizSubArvore.direita != null){
                postfix(raizSubArvore.direita);
            }
            System.out.print(numeroParaLetra(raizSubArvore.dado));
            System.out.print(" ");
        }
    }

    private void infix(No raizSubArvore) throws Exception {
        if (raiz == null){
            throw new Exception("Arvore vazia");
        }else {
            if (raizSubArvore.esqurda != null){
                infix(raizSubArvore.esqurda);
            }
            System.out.print(numeroParaLetra(raizSubArvore.dado));
            System.out.print(" ");
            if (raizSubArvore.direita != null){
                infix(raizSubArvore.direita);
            }
        }
    }

    private void prefix(No raizSubArvore) throws Exception {
        if (raiz == null){
            throw new Exception("Arvore vazia");
        }else {
            System.out.print(numeroParaLetra(raizSubArvore.dado));
            System.out.print(" ");
            if (raizSubArvore.esqurda != null){
                prefix(raizSubArvore.esqurda);
            }
            if (raizSubArvore.direita != null){
                prefix(raizSubArvore.direita);
            }
        }
    }

    public void prefixSearch() throws Exception {
        prefix(raiz);
    }

    public void infixSearch() throws Exception {
        infix(raiz);
    }

    public void postfixSearch() throws Exception {
        postfix(raiz);
    }

    private No nodeSearch(No raizSubArvore, int valor) throws Exception {
        if (raiz == null){
            throw new Exception("Arvore vazia");
        }else if(raizSubArvore.dado > valor){
            return nodeSearch(raizSubArvore.esqurda,valor);
        } else if (raizSubArvore.dado < valor) {
            return nodeSearch(raizSubArvore.direita,valor);
        }else {
            return raizSubArvore;
        }
    }

    private int nodeLevel(No raizSubArvore, int valor) throws Exception {
        if (raiz == null){
            throw new Exception("Arvore vazia");
        }else if(raizSubArvore.dado > valor){
            return 1 + nodeLevel(raizSubArvore.esqurda,valor);
        } else if (raizSubArvore.dado < valor) {
            return 1 + nodeLevel(raizSubArvore.direita,valor);
        }else {
            return 0;
        }
    }

    public void search(int valor){
        try{
            No no = nodeSearch(raiz,valor);
            int level = nodeLevel(raiz,valor);
            System.out.println("Dado: "+ no.dado+" no nivel: " + level);
        }catch (Exception e){
            System.out.println("Dado não encontrado");
        }
    }

    private No remove(No raizSubArvore, int valor) throws Exception {
        if (raiz == null){
            throw new Exception("Arvore vazia");
        } else if (raizSubArvore.dado > valor) {
            raizSubArvore.esqurda = remove (raizSubArvore.esqurda,valor);
        } else if (raizSubArvore.dado < valor) {
            raizSubArvore.direita = remove (raizSubArvore.direita,valor);
        }else {
            if (raizSubArvore.esqurda == null && raizSubArvore.direita == null){
                raizSubArvore = null;
            } else if (raizSubArvore.esqurda == null) {
                raizSubArvore = raizSubArvore.direita;
            } else if (raizSubArvore.direita == null) {
                raizSubArvore = raizSubArvore.esqurda;
            }else {
                No no = raizSubArvore.esqurda;
                while(no.direita != null){
                    no  = no.direita;
                }
                raizSubArvore.dado = no.dado;
                no.dado = valor;
                raizSubArvore.esqurda = remove(raizSubArvore.esqurda,valor);
            }
        }
        return raizSubArvore;
    }

    public void removeChild(int valor) throws Exception {
        remove(raiz,valor);
    }

    public int letraParaNumero(char letra) {
        return (int) letra + 32;
    }

    public char numeroParaLetra(int numero) {
        return (char) (numero - 32);
    }
}