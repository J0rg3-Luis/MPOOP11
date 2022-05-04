/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Clase que construye una Excepción de MaximoDeRetiro (Número máximo de retiros)
 * @author alumno
 */
public class MaximosDeRetiros extends Exception{
    
    /**
     * Método que imprime la cadena "No se puede realizar más de tres retiros"
     */
    
    public MaximosDeRetiros(){
        super("No se puede realizar más de tres retiros");
    }   
}
