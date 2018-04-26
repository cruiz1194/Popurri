/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import ClasesVarias.Calculadora;

/**
 *
 * @author Carlos
 */
public class Java_Things {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola desde Java, vamos a probar una calculadora simple");
        Calculadora myCalc = new Calculadora();
        System.out.println("Resultado: " + myCalc.Suma(2, 3));
    }
    
}
