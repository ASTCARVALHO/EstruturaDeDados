package Arvores;

import org.w3c.dom.Node;

public class Arvore {

    private No raiz;
    private int tamanho;

    public Arvore() {
        raiz = null;
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isVazia() {
        return raiz == null;
    }
    public <T> void adicionar(int chave,T valor){
        tamanho++;

        if(isVazia()) {
            raiz.setChave(chave);
            raiz.setValor(valor);
        }else {
            No p = raiz;
            while(p != null){
                if(chave < raiz.getChave()){
                    p.setEsquerda(chave,valor);
                }
            }

        }

        return;
    }
}
