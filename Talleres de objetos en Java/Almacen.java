package co.Sofka.Taller1;

/**
 * Clase Almacen
 * Contiene informacion de un Almacen
 * 
 * @author Eduwin Rojas
 *
 */
public class Almacen {
	
	/**
	 * Atributos de la clase Almacen, nit, nombre, sucursal,
	 * sucursal, nombre de gerente y tlefono.
	 */
	private String nit;
	private String nombre;	
	public String sucursal;
	public String direccion;
	public String nombreGerente;
	private String telefono;
	
	/**
     * Constructor por defecto.
     */
    public Almacen() {
    }
    
    /**
	 * Devuelve nombre de un Almacen.
	 * @return name
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el nombre de un Almacen.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve direccion de un Almacen.
	 * @return direccionn
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Modifica la direccion de un Almacen.
	 * @param direccion
	 */
	public void setDireccionn(String direccion) {
		this.direccion = direccion;
	}   

}
