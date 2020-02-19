/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

/**
 * Esta clase define una cuenta corriente y contiene los métodos que operan con
 * la misma: ingresar, retirar... así como el control de errores.
 *
 * @author Dregoth
 *
 */
public class CCuenta {

    /**
     * método que devuelve el número de la cuenta
     *
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * método que cambia el número de cuenta
     *
     * @param cuenta la nueva cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * método que devuelve el saldo de la cuenta
     *
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * método que cambia el saldo de la cuenta
     *
     * @param saldo el nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la cuenta sin parámetros
     *
     */
    public CCuenta() {
    }

    /**
     * Constructor de la cuenta con parámetros
     *
     * @param nom es el nombre del cliente
     * @param cue es el número de cuenta
     * @param sal es el saldo inicial de la cuenta
     * @param tipo es el tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * método que cambia el nombre del titular
     *
     * @param nom es el nombre que será introducido
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método que recibe el nombre del titular
     *
     * @return nombre del titular
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * método que devuelve el saldo de la cuenta
     *
     * @return saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * método que añade fondos al saldo de la cuenta
     *
     * @param cantidad es la cantidad añadida
     * @throws Exception en caso de que la cantidad a añadir sea negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * método que retira fondos del saldo de la cuenta
     *
     * @param cantidad la cantidad a retirar
     * @throws Exception si la cantidad a retirar es negativa o no hay saldo
     * suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * método que muestra el número de cuenta
     *
     * @return número de cuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * método que muestra el nombre del titular
     *
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * método que cambia el nombre del titular
     *
     * @param nombre el nombre del nuevo titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * método que devuelve el tipo de interés de la cuenta
     *
     * @return el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * método que cambia el tipo de interés
     *
     * @param tipoInterés el nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
