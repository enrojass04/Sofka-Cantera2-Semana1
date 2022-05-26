package co.Sofka.Taller1;

/**
 * 
 * @author enrojass
 *
 */
public class Usuario {
	
	/**
	 * 
	 */
	private String tipoProducto;
	
	/**
	 * 
	 */
	private String codigo;

	/**
	 * 
	 */
	public String nombreProducto;

	/**
	 * 
	 */
	protected double precio;
	
	/**
	 * 
	 */
	private int cantidad;
	
	/**
	 * 
	 */
	public Usuario() {
	}
	
	/**
	 * 
	 */
	public Usuario(String tipoProducto, String codigo, String nombreProducto, double precio, int cantidad) {
		this.tipoProducto = tipoProducto;
		this.codigo = codigo;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	/**
	 * 
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}
	
	/**
	 * 
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	protected String getTipoProducto() {
		return tipoProducto;
	}

	protected void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
}
