package Arvores;

public class Node<E> {
    private E dado;
    private Node<E> esquerda;
    private Node<E> direita;

    public E getDado() {
        return dado;
    }

    public void setDado(E novoDado) {
        this.dado = dado;
    }

    public Node<E> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node<E> esquerda) {
        this.esquerda = esquerda;
    }

    public Node<E> getDireita() {
        return direita;
    }

    public void setDireita(Node<E> direita) {
        this.direita = direita;
    }

    public Node(E dado){
        this.dado = dado;
        this.esquerda = null;
        this.direita = null;
    }
}
