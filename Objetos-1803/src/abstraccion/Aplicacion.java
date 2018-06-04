/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class Aplicacion {
     public static void main(String[] args) {
        // Crear un objeto de tipo Grado
            Grados g=new Grados();
        //A este objeto le asignaos un valor a su atributo centigradoss
        g.setCentigrados(20);
        
        //Creamos un objetos de la clase conversion
        Conversion c=new Conversion();
        c.setGrados(g);
        //Aplicar el Modelo
        System.out.println(c.centigradosAFarenheit());
    }
}
