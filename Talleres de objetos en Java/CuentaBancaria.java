package co.Sofka.Taller1;

/**
 * Clase Cuenta Bancaria
 * Contiene informacion de una Cuenta Bancaria
 * 
 * @author Eduwin Rojas
 *
 */
public class CuentaBancaria {
	
    /**
     * Atributos de la clase Cuenta Bancaria, Numero de cuenta y si está o no activada.
     */
    private int accountNumber;

    protected boolean activated;
    
	/**
     * Constructor por defecto
     */
    public CuentaBancaria() {
    }

    /**
     * Constructor con 2 parametros
     * @param accountNumber numero de la cuenta
     * @param activated estado de la cuenta (activa, No activa)
     */
	public CuentaBancaria(int accountNumber, boolean activated) {
		this.accountNumber = accountNumber;
		this.activated = activated;
	}
	
	/**
	 * Devuelve el estado de activación de la cuenta.
	 * @return activated 
	 */
	public boolean isActivated() {
		return activated;
	}
	
	/**
	 * Modifica el estado de activación de la cuenta.
	 * @param activated 
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}  
    
}
