/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E.T.E;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class Tarjeta {
    private int numero;
    private String nombre;
    private float saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public Tarjeta(String nombre, int numero,float saldo){
    this.nombre=nombre;
    this.numero=numero;
    this.saldo=saldo;
    }
    /*public Tarjeta(){

    }
    public Tarjeta(String nombre, int numero){
    this.nombre=nombre;
    this.numero=numero;
    }*/
}
