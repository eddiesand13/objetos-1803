/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfissmo;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class EmpresaX {
    public static void main(String[] args)
    {
        Planta p1=new Planta();
        Planta p2=new Planta();
        
        Honorarios h1=new Honorarios();
        Honorarios h2=new Honorarios();
        Honorarios h3=new Honorarios();
        
        Proyecto prol=new Proyecto();
        
        Trabajador []trabajadores={p1,p2,h1,h2,h3,prol, new Proyecto() };
    
        for(Trabajador t:trabajadores){
            t.pagar();
        }
    }
    
}
