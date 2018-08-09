/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class PersistenciaUsuario {
    public static void guardar(Usuario u)throws Exception{
        
        File file=new File("C:\\Users\\IrwingEdwingCarmonaS\\Desktop\\Archivaldo.yomero");
        
        FileOutputStream fos=new FileOutputStream(file);
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
        
    }
}
