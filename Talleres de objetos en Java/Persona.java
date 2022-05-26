package co.Sofka.Taller1;

/**
 * Clase Persona
 * Contiene informacion de una Persona
 * @author Eduwin Rojas
 *
 */
public class Persona {
	
	/**
     * Atributos de la clase Persona, nombre, primer apellido, 
     * Segundo apellido, fecha de nacimiento y altura.
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public String dateBirth;
    public float height;
    
    /**
     * Constructor por defecto.
     */
    public Persona() {
    }
    
    /**
     Constructor con 5 parametros.
     * @param name nombre de la persona.
     * @param lastName1 primer apellido de la persona.
     * @param lastName2 segundo apellido de la persona.
     * @param dateBirth fecha de nacimiento de la persona.
     * @param height altura de la persona.
     */
	public Persona(String name, String lastName1, String lastName2, String dateBirth, float height) {
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
	}
	
	/**
	 * Devuelve nombre de una Persona.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Modifica el nombre de una Persona.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}	

}
