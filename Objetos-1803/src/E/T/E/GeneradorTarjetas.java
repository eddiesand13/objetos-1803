/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E.T.E;

import java.util.ArrayList;

/**
 *
 * @author IrwingEdwingCarmonaS
 */

public class GeneradorTarjetas {

    public GeneradorTarjetas(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
private ArrayList <Cliente> clientes;
            
    public GeneradorTarjetas() {
        clientes=new ArrayList<>();
        clientes.add(new Cliente("Juan",new Tarjeta("Banamex",1234,32000)));
        clientes.add(new Cliente("Ana",new Tarjeta("HSBC",5675,17500)));
        clientes.add(new Cliente("Pedro",new Tarjeta("Scotia",8765,19600)));
        clientes.add(new Cliente("Irwma",new Tarjeta("Bancomer",4321,48000)));
    }

    public ArrayList <Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList <Cliente> clientes) {
        this.clientes = clientes;
    }


 
}
