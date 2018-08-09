/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class Aplicacion {
    
    public static void main(String[]args)throws Exception{
       
        
        Usuario u= new Usuario();
        u.setEdad(46);
        u.setNombre("Juan Carlos");
        u.setSueldo(45000);
        
        PersistenciaUsuario.guardar(u);
        System.out.println("Guardado con Exito!!");
    }
}
