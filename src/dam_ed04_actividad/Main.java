/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 3000, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

           /**
            * @param cantidad es irrelevante en el ejercicio
           */
           operativa_cuenta(cuenta1, 666);
            
           System.out.println("El saldo actual es " + cuenta1.estado());
    }

    /**
    * Método que opera sobre una cuenta corriente existente, retirando 
    *   e ingresando cantidades en dicha cuenta. 
    *   @param cuenta1 define la cuenta sobre la que se opera
    *   @param cantidad se añadio como parte del ejercicio y no tiene ninguna función
    */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2000);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

}
