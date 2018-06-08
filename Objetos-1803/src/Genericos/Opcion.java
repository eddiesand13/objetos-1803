/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class Opcion {
private String Opcion;
private boolean Correcta;
private String Titulo;

    /**
     * @return the Opcion
     */
    public String getOpcion() {
        return Opcion;
    }

    /**
     * @param Opcion the Opcion to set
     */
    public void setOpcion(String Opcion) {
        this.Opcion = Opcion;
    }

    /**
     * @return the Correcta
     */
    public boolean isCorrecta() {
        return Correcta;
    }

    /**
     * @param Correcta the Correcta to set
     */
    public void setCorrecta(boolean Correcta) {
        this.Correcta = Correcta;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
}
