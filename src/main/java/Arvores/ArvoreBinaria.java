package Arvores;

import javax.swing.*;

public class ArvoreBinaria <E extends Comparable>  {
        private Node<E> raiz;

        public ArvoreBinaria(){
            this.raiz = null;
        }

        public void adicionar(E dado){
            Node<E> node = new Node<>(dado);
             if(raiz == null){
                 this.raiz = node;
             }else{
                 Node<E> atual = this.raiz;
                 while (true){
                     if(node.getDado().compareTo(atual.getDado()) == -1){
                         if (atual.getEsquerda() != null){
                             atual = atual.getEsquerda();
                         }else{
                             atual.setEsquerda(node);
                             break;
                         }
                     }else {
                         if (atual.getDireita() != null){
                             atual = atual.getDireita();
                         }else {
                             atual.setDireita(node);
                             break;
                         }
                     }
                 }
             }
        }

    public Node<E> getRaiz() {
        return raiz;
    }

    public void setRaiz(Node<E> raiz) {
        this.raiz = raiz;
    }

    public void emOrdem(Node<E> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getDado());
            emOrdem(atual.getDireita());
        }
    }
    public void preOrdem(Node<E> atual) {
        if (atual != null) {
            System.out.println(atual.getDado());
            emOrdem(atual.getEsquerda());
            emOrdem(atual.getDireita());
        }
    }
    public void posOrdem(Node<E> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            emOrdem(atual.getDireita());
            System.out.println(atual.getDado());
        }
    }

    public boolean removerNo(E dado){
        Node<E> atual = this.raiz;
        Node<E> paiAtual = null;
        while (atual != null){
            if(atual.getDado().equals(dado)){
              break;
            } else if (dado.compareTo(atual.getDado()) == -1) {
                paiAtual = atual;
                atual = atual.getEsquerda();
            }else {
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }
        if (atual != null){
            // caso: = filho só a direita
            if (atual.getDireita() != null){
                Node<E> substituto = atual.getDireita();
                Node<E> paiSubstituto = atual;
                while (substituto.getEsquerda() != null){
                    paiSubstituto = substituto;
                   substituto = substituto.getEsquerda();
                }
                substituto.setEsquerda(atual.getEsquerda());
                if (paiAtual != null) {

                    if (atual.getDado().compareTo(paiAtual.getDado()) == -1) {
                        paiAtual.setEsquerda(substituto);
                    } else {
                        paiAtual.setDireita(substituto);
                    }
                }else {
                    this.raiz = substituto;
                }

            } else if (atual.getEsquerda() != null) {   // caso: filho só a esquerda
                Node<E> substituto = atual.getEsquerda();
                Node<E> paiSubstituto = atual;
                while (substituto.getDireita() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }
                if (paiAtual != null) {
                    if (atual.getDado().compareTo(paiAtual.getDado()) == -1) {
                        paiAtual.setEsquerda(substituto);
                    } else {
                        paiAtual.setDireita(substituto);
                    }
                }else {
                    this.raiz = substituto;
                }
            }else {  // caso: não tem filho
                if (paiAtual != null) {
                    if (atual.getDado().compareTo(paiAtual.getDado()) == -1) {
                        paiAtual.setEsquerda(null);
                    } else {
                        paiAtual.setDireita(null);
                    }
                }else {
                    this.raiz = null;
                }
            }
        }
        return(atual != null);
    }

    }

