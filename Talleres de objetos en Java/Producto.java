package co.Sofka.Taller1;

/**
 * Clase Producto Contiene informacion de una Producto
 * 
 * @author Eduwin Rojas
 *
 */
public class Producto {

	/**
	 * Atributos de la clase Persona, nombre, primer apellido,
	 */
	private String codigo;
	private String nombre;
	protected String tipo;
	private double precio;
	public int cantidad;
	
	/**
     * Constructor por defecto.
     */
    public Producto() {
    }
    
    /**
	 * Devuelve nombre de un Producto.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el nombre de un Producto.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve la cantidad de un Producto.
	 * @return cantidad
	 */
	protected int getCantidad() {
		return cantidad;
	}
	
	/**
	 * Modifica la cantidad de un Producto.
	 * @param cantidad
	 */
	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
    
}
