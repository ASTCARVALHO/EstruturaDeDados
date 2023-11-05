package Arvores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArvoreBinariaTest {
    @Test
    public void adicionarEImprimir(){
        ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<>();
        arvoreBinaria.adicionar(10);
        arvoreBinaria.adicionar(7);
        arvoreBinaria.adicionar(12);
        System.out.println("Em ordem");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("------------------------------------------------");
        System.out.println("Pre-Ordem");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("------------------------------------------------");
        System.out.println("Pós-Ordem");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
    }
}