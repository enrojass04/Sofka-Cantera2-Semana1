package co.Sofka.Taller2;

/**
 * 
 * @author Eduwin Rojas
 *
 */
public abstract class Spacecraft {
	
	/**
     * Atributos de la clase Spacecraft, name, country y weight.
     */	
	protected String name;
	protected String country;
	protected double weight;
	
	/**
     * Constructor con 3 parametros
     * @param name nombre de la nave
     * @param country país de fabricación de la nave
     * @param weight peso de la nave
     */
	public Spacecraft(String name, String country, double weight) {
		this.name = name;
		this.country = country;
		this.weight = weight;
	}

	/**
     * Devuelve el nombre de una Nave
     * @return name 
     */
	public String getName() {
		return name;
	}

	/**
	 * Modifica el nombre de una Nave
	 * @param name 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
     * Devuelve el nombre de una Nave
     * @return country 
     */
	public String getCountry() {
		return country;
	}

	/**
	 * Modifica el pais de fabricación de una Nave
	 * @param country 
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
     * Devuelve el peso de una Nave
     * @return weight 
     */
	public double getWeight() {
		return weight;
	}

	/**
     * Devuelve el peso de una Nave
     * @return weight 
     */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Metodo Asbtracto de sistema de propulsion de una nave
	 */
	public abstract void propulsionSystem();

}
