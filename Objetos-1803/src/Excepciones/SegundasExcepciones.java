/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import javax.swing.SpringLayout;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class SegundasExcepciones {
    public static void main(String[] args) {
        int a=2;
        int b=2;
        int arregle[]={1,2};
        try
        {
            String numeroMalo="cuatro";
            int numeroBueno=Integer.parseInt(numeroMalo);
            
            System.out.println(a/b);
            System.out.println(numeroBueno*2);
            System.out.println(arregle[3]);
        }
        /*catch(NumberFormatException e)
        {
            System.out.println("podrias meter un numero valido?");
        }
        catch(ArithmeticException e)
        {
        System.out.println("No se aceptan divisiones por cero");
        }*/
        catch(Exception e)
        {
            System.out.println("Este indice no Existe "+e.getMessage());
            System.out.println("Veamos que excepcion ocurre "+e.getMessage());
        }
    }
}
