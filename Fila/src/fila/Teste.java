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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila minhaFila = new Fila(5);

        Inteiro item;

        for (int i = 0; i < 6; i++) {

            item = new Inteiro(i * i);

            try {

                minhaFila.enfileirar(item);

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }

        }

        minhaFila.imprimir();

    }

}

    

