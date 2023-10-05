package Arvores;

public class No<T> {

    private int chave;
    private int valor;
    private T esquerda;
    private T direita;
    private T pai;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public T getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(T esquerda) {
        this.esquerda = esquerda;
    }

    public T getDireita() {
        return direita;
    }

    public void setDireita(T direita) {
        this.direita = direita;
    }

    public T getPai() {
        return pai;
    }

    public void setPai(T pai) {
        this.pai = pai;
    }

    public No(int chave, int valor) {
        this(chave, valor, null, null, null);
    }

    public No(int chave, int valor, T esquerda, T direita, T pai) {
        this.chave = chave;
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
        this.pai = pai;
    }
}
