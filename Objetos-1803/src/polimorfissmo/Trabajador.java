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
public abstract class  Trabajador {

    /**
     * @return the seguro
     */
        private int seguro;
    private String nombre;
    private float sueldoBase;
    public abstract void pagar();
    
    public int getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sueldoBase
     */
    public float getSueldoBase() {
        return sueldoBase;
    }

    /**
     * @param sueldoBase the sueldoBase to set
     */
    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    
}
