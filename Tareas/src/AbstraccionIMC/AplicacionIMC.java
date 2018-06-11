/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstraccionIMC;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class AplicacionIMC {
    public static void main(String[]Args)
    {
    MedidasIMC m=new MedidasIMC();    
    
    m.setAltura(1.7f);
    m.setPeso(71);
    
    Calculo c=new Calculo();
    c.setMedidasimc(m);
    
    System.out.println(c.calculoIMC());
        
    }

    
}
