/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class medidas {
    private int lado1;
    private int lado2;

    public medidas(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public medidas() {
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

}
