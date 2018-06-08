/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.*;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class Cuestionario {

    /**
     * @return the preguntas
     */
    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * @param preguntas the preguntas to set
     */
    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    /**
     * @return the resultado
     */
    public float getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

private ArrayList<Pregunta> preguntas;
private float resultado;

   
}

