/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Clase que construye una Cuenta
 * @author alumno
 */
public class Cuenta {
    private float saldo;
    private int numRetiros;
    
    /**
     * Constructor vacío
     */
    
    public Cuenta() {
    }

    public float getSaldo() {
        return saldo;
    }
    
    /**
     * Método que realiza un deposito de un monto a una cuenta de banco
     * @param monto El monto que se deposita a la cuenta
     * @throws MontoMaximoExcepcion Excepción del monto máximo que se puede depositar
     */
    
    public void despositar(float monto) throws MontoMaximoExcepcion{
        System.out.println("Depositando... $" +monto);
        if(monto > 20_000){
            throw new MontoMaximoExcepcion();
        }
        else{
            saldo+=monto;
        }  
    }
    
    /**
     * Método que realiza un retiro de un monto de una cuenta de banco
     * @param monto El monto que se retira de la cuenta
     * @throws SaldoInsuficienteExcepcion Excepción del saldo insuficiente que se quiere retirar mayor al monto de la cuenta
     * @throws MaximosDeRetiros Excepción del máximo de retiros que se le pueden hacer a una cuenta
     */
    
    public void retirar(float monto) throws SaldoInsuficienteExcepcion,MaximosDeRetiros {
        if(saldo < monto){
            throw new SaldoInsuficienteExcepcion();
        }else if(numRetiros>2){
            throw new MaximosDeRetiros();
        }
        else{
            System.out.println("Retirando: $" +monto);
        saldo-=monto;
        numRetiros++;
        }  
    }  
}
