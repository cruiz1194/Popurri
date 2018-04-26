/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVarias;

/**
 *
 * @author Carlos
 */
public class Calculadora {
    float a = 0;
    float b = 0;
    
    public Calculadora(){
        
    }
    
    public Calculadora(float a, float b){
        this.a = a;
        this.b = b;
    }
    
    public float Suma(float a, float b){
        return a + b;
    }
    
}
