/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class ProbarOrdenamientos {
    public static void main(String[] args) {
        Set<Integer> enteros=new LinkedHashSet<>();
  /*      enteros.add(2);
        enteros.add(3);
        enteros.add(2);
    
        System.out.println(enteros.size());
        for(Integer i:enteros)
        {
            System.out.println(i);
        }*/
        System.out.println("Aleatorios");
     //   Random r=new Random();
       // int numero=r.nextInt(4);
        //System.out.println("El numero aleatorio es: " +numero);
        
       while(enteros.size()<4)
       {
        Random r=new Random();
        int numero=r.nextInt(4);
       enteros.add(numero);
       }
    //System.out.println(enteros.size());
        for(Integer i:enteros)
        {
            System.out.println(i);
        }
    
    }

}
