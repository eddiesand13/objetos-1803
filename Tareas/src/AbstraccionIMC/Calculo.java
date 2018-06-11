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
public class Calculo {
    
    private MedidasIMC medidasimc;

    /**
     * @return the medidasimc
     */
    public MedidasIMC getMedidasimc() {
        return medidasimc;
    }

    /**
     * @param medidasimc the medidasimc to set
     */
    public void setMedidasimc(MedidasIMC medidasimc) {
        this.medidasimc = medidasimc;
    }
    
    public float calculoIMC()
    {
        float resultado = medidasimc.getPeso()/(medidasimc.getAltura()*medidasimc.getAltura());
        return resultado;
    }
}
