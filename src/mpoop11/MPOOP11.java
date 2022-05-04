/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("############### Mensajes ############### ");
        try{
            String[] mensajes = {"Mensaje 1","Mensaje 2","Mensaje 3"};
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);            
            }
            }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Sigue el código");
        
        System.out.println("\n############### División entre 0 ############### ");
        try{
        float x=10/0;
        System.out.println("x= "+x);
        }
        catch(ArithmeticException ex){
            System.out.println("error "+ex.getMessage());
        }
        finally{
            System.out.println("A pesar de todo se ejecuta el finally");
        }
        
        System.out.println("\n############### Catch anidados ############### ");
        try{
        float x=10/0;
        System.out.println("x= "+x);
        }
        catch(ArithmeticException ex){
            System.out.println("error "+ex.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("error "+ex.getMessage());
        }
        finally{
            System.out.println("A pesar de todo se ejecuta el finally");
        }
        
        System.out.println("\n############### Propagación de excepciones ############### ");
        try{
        double division = miMetodoDivision(20.0f,0);
        System.out.println(division);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n############### Mi Cuenta ############### ");
        Cuenta cuenta = new Cuenta();
        
        try {
            System.out.println(cuenta.getSaldo());
            cuenta.despositar(100);
            System.out.println(cuenta.getSaldo());
            cuenta.retirar(1500);
            System.out.println(cuenta.getSaldo());
        } 
        catch (SaldoInsuficienteExcepcion | MaximosDeRetiros ex) {
            System.out.println(ex.getMessage());
        }catch (MontoMaximoExcepcion ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Saldo final: "+cuenta.getSaldo());
        
        System.out.println("\n############### Cuenta No. 1 ############### ");
        Cuenta cuenta1 = new Cuenta();
        try{
            System.out.println(cuenta1.getSaldo());
            cuenta1.despositar(19_999);
            cuenta1.despositar(20_001);
        }catch(MontoMaximoExcepcion  ex){
            System.out.println(ex.getLocalizedMessage());    
        }
        
        System.out.println("\n############### Cuenta No. 2 ############### ");
        Cuenta cuenta2 = new Cuenta();
        try{
            System.out.println(cuenta2.getSaldo());
            cuenta2.despositar(500);
            cuenta2.retirar(100);
            cuenta2.retirar(100);
            cuenta2.retirar(100);
            cuenta2.retirar(100);        
        }catch(MontoMaximoExcepcion | MaximosDeRetiros | SaldoInsuficienteExcepcion ex){
            System.out.println(ex.getLocalizedMessage());    
        }
    }

    private static double miMetodoDivision(double f, double d) throws ArithmeticException {
        return f/d;
    }
    
    }
    