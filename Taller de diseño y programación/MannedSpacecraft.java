package co.Sofka.Taller2;

/**
 * 
 * @author Eduwin Rojas
 *
 */
public class MannedSpacecraft extends Spacecraft implements ShowSpacecraft {
	
	/**
     * Constructor con 3 parametros
     * @param name nombre de la nave
     * @param country país de fabricación de la nave
     * @param weight peso de la nave
     */
	public MannedSpacecraft(String name, String country, double weight) {
		super(name, country, weight);
	}
		
	/**
	 * Metodo que imprime los atributos de la clase. 
	 */
	@Override
	public void print() {
		System.out.println("Nombre : " + name + "\n"
				 + "Contruido por: " + country + "\n"
				 + "Peso : " + weight + " Toneladas" + "\n"
				 + "Nave tripulada");

	}
	
	/**
	 * Metodo que muestra el sistema de propulsion de una nave
	 */
	@Override
	public void propulsionSystem() {
		System.out.println("Soy propulsado por Queroseno + H(liq) ó UDMH+N2O4 en USA");
		System.out.println("Soy propulsado por NO + Amina en Russia");
		System.out.println("Soy propulsado por UDMH+N2O4 en China");
	}

}
