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
    }

