/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Clase que construye una Excepción de SaldoInsuficienteExcepcion (Monto que se quiere retirar mayor al saldo de la cuenta)
 * @author alumno
 */
public class SaldoInsuficienteExcepcion extends Exception {
    
    /**
     * Método que imprime la cadena "Saldo Insuficiente"
     */
    
    public SaldoInsuficienteExcepcion() {
        super("Saldo insuficiente");
    } 
}
