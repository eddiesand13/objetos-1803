/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author IrwingEdwingCarmonaS
 */
public class Threadsito extends Thread{
    
    public void run(){
        System.out.println("Soy un 'Thread' y mi nombre es "+Thread.currentThread().getName());
    }
    
}
