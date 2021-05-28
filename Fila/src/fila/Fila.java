/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author Max
 */
public class Fila {
    private Inteiro fila[];
    private int frente;
    private int tras;
    private int tamanho;
    
    Fila(int n ){
        this.tamanho = n;
        fila = new Inteiro[n];
        for(int i =0; i<n; i++){
            fila[i]=new Inteiro();
        }
        this.frente = 0;
        this.tras = 0;
    }
    public void enfileirar(Inteiro novo) throws Exception{
        if(!filaCheia()){
            fila[this.tras%tamanho]= novo;
            tras++;
        }
        else
            new Exception("Nao foi possivel inserir o item na fila: a fila esta cheia!");
    }
    public Inteiro desenfileirar()throws Exception{
      Inteiro item = null;
      if(!filaVazia()){
        item = fila[this.frente%tamanho];
        this.frente++;
      }
      else{
          new Exception("Nao foi possivel desenfileirar nenhum item da fila: a fila esta vazia!");
      }
      return item;
    }
    public boolean filaVazia(){
        boolean resp;
        if(this.frente==this.tras)
            resp = true;
        else
            resp = false;
        return resp;
    }
    public boolean filaCheia(){
        boolean resp;
        if(((this.tras+1)%tamanho)==(this.frente%tamanho))
            resp = true;
        else
            resp = false;
        return resp;
    }
    public void imprimir(){
        for(int i = frente; i < tras; i++){
            System.out.println(fila[i%tamanho].getValor());
        }
    }
}
