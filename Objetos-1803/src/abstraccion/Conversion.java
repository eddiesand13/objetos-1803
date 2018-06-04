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
public abstract class Conversion {

    private Grados grados;
    private Medidas medidas;
    
    
    
    public Grados getGrados() {
        return grados;
    }
    public void setGrados(Grados grados) {
        this.grados = grados;
    }

    public float centigradosAFarenheit()
    {
        //Este metodo tiene logica
        
        float resultado = grados.getCentigrados()*1.8f+32;
        return resultado;
    }

    /**
     * @return the medidas
     */
    
    public float FarenheitACentigrados()
    {
        return (grados.getFarenheit()-32)/1.8f;
    }
    public Medidas getMedidas() {
        return medidas;
    }

    /**
     * @param medidas the medidas to set
     */
    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }
    
    public float centimetrosAPies()
    {
        //Este metodo tiene logica
        
        float resultado = medidas.getPies()/30.48f;
        return resultado;
    }


public float piesACentigrados()
{
    return medidas.getPies()*30.48f;
}
}
