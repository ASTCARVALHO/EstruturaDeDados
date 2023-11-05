package Arvores;

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

    }

