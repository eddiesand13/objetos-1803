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
public class Medidas {

    /**
     * @return the centirados
     */
    public float getCentirados() {
        return centirados;
    }

    /**
     * @param centirados the centirados to set
     */
    public void setCentirados(float centirados) {
        this.centirados = centirados;
    }

    /**
     * @return the pies
     */
    public float getPies() {
        return pies;
    }

    /**
     * @param pies the pies to set
     */
    public void setPies(float pies) {
        this.pies = pies;
    }
    
    private float centirados;
    private float pies;
}
