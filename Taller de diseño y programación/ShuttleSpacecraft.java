package co.Sofka.Taller2;

/**
 * 
 * @author Eduwin Rojas
 *
 */
public class ShuttleSpacecraft extends Spacecraft implements ShowSpacecraft {

	/**
     * Constructor con 3 parametros
     * @param name nombre de la nave
     * @param country país de fabricación de la nave
     * @param weight peso de la nave
     */
	public ShuttleSpacecraft(String name, String country, double weight) {
		super(name, country, weight);
	}

	/**
	 * Metodo que imprime los atributos de la clase. 
	 */
	@Override
	public void propulsionSystem() {
		System.out.println("Soy propulsado por NO4+MMH ó N2H4 ó PuO2 en USA");
		System.out.println("Soy propulsado por UDMH+N2O4 ó N2H4+Amina en Rusia");
		System.out.println("Soy propulsado por UDMH+N2O4 en Europa");
	}
	
	/**
	 * Metodo que muestra el sistema de propulsion de una nave
	 */
	@Override
	public void print() {
		System.out.println("Nombre : " + name + "\n"
				 + "Contruido por: " + country + "\n"
				 + "Peso : " + weight + " Toneladas" + "\n"
				 + "Nave tripulada");
	}

}
