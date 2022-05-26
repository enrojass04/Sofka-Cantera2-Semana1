package co.Sofka.Taller1;

import java.util.ArrayList;

/**
 * Clase Fruta
 * Contiene informacion de una Fruta
 * 
 * @author Eduwin Rojas
 *
 */
public class Fruta {
	
    /**
     * Atributos de la clase Fruta, nombre, peso promedio y colores.
     */
    public String name;
    private float averageWeigth;
    public ArrayList<String> colors;

    /**
     * Constructor por defecto
     */
    public Fruta() {
    }

    /**
     * Constructor con 3 parametros
     * @param name nombre de la fruta
     * @param averageWeigth peso promedio de la fruta
     * @param colors colores de la fruta
     */
    public Fruta(String name, float averageWeigth, ArrayList<String> colors) {
		this.name = name;
		this.averageWeigth = averageWeigth;
		this.colors = colors;
	}
    
    /**
     * Devuelve los colores de una Fruta
     * @return colors 
     */
	public ArrayList<String> getColors() {
		return colors;
	}
	
	/**
	 * Modifica los colores de una Fruta
	 * @param colors 
	 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}   

}
