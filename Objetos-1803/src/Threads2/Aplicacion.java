/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads2;

import java.time.LocalTime;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class Aplicacion implements Runnable{
    public static void main(String[] args) {
        Runnable r=new Aplicacion();
        Thread t01=new Thread(r);
        t01.start();
    }
    public void run(){
        System.out.println("Un Thread creado de la segunda forma");
         while(true){
        LocalTime tiempo=LocalTime.now();
        int hora=tiempo.getHour();
        int minute=tiempo.getMinute();
        int segundo=tiempo.getSecond();
        System.out.println("La hora es: "+hora+":"+minute+":"+segundo);  
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
        
        }
    }
    }
}
