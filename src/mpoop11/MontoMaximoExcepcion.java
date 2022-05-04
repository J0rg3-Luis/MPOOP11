/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Clase que construye una Excepción de MontoMaximoExcepcion (Monto máximo que se puede de depositar)
 * @author alumno
 */
public class MontoMaximoExcepcion extends Exception {
    
    /**
     * Método que imprime la cadena "No se puede depositar más de $20,000"
     */
    
    public MontoMaximoExcepcion() {
        super("No se puede depositar más de $20,000");
    }   
}

