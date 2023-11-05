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
    @Test
    public void AdicionaERemove(){
        ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<>();
        arvoreBinaria.adicionar(10);
        arvoreBinaria.adicionar(8);
        arvoreBinaria.adicionar(18);
        arvoreBinaria.adicionar(5);
        arvoreBinaria.adicionar(7);
        arvoreBinaria.adicionar(9);
        arvoreBinaria.adicionar(13);
        arvoreBinaria.adicionar(20);
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.removerNo(20);
        System.out.println("-------------------------------");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.removerNo(5);
        System.out.println("-------------------------------");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.removerNo(8);
        System.out.println("-------------------------------");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.removerNo(9);
        System.out.println("-------------------------------");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.removerNo(13);
        System.out.println("-------------------------------");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.removerNo(10);
        System.out.println("-------------------------------");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
    }
}