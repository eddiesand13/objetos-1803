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
public class AplicacionPregunta {
 public static void main(String []args)
 {
 Opcion o11=new Opcion();
 o11.setTitulo("Mizcalco");
 o11.setCorrecta(false);
 
  Opcion o21=new Opcion();
 o21.setTitulo("Texcoco");
 o21.setCorrecta(false);
 
  Opcion o31=new Opcion();
 o31.setTitulo("Madrid");
 o31.setCorrecta(false);
 
  Opcion o41=new Opcion();
 o41.setTitulo("Ecatepec");
 o41.setCorrecta(false);
 
 Pregunta p11=new Pregunta();
 p11.setTitulo("Cual es la capital de Espana?");
 
 ArrayList<Opcion> opcionesp11=new ArrayList<>();
 opcionesp11.add(o11);
  opcionesp11.add(o21);
 opcionesp11.add(o31);
  opcionesp11.add(o41);
  
  p11.setOpciones(opcionesp11);
  
  Cuestionario c1=new Cuestionario();
  ArrayList<Pregunta> preguntas=new ArrayList<>();
  preguntas.add(p11);
  c1.setPreguntas(preguntas);
  
  for(Pregunta p:preguntas)
  {
      System.out.println(p.getTitulo());
      for(Opcion o:p.getOpciones()){
          System.out.println(o.getTitulo());
      }
  }
 }
}
