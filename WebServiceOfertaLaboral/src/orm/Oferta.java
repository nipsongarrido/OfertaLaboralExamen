/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package orm;

/**
 * tabla en la que se guardaran las ofertas que se ingresen al sistema
 */
public class Oferta {
	public Oferta() {
	}
	
	private int id;
	
	private String detalle;
	
	private String mail;
	
	private String fecha_vigencia;
	
	private String fecha_publicacion;
	
	/**
	 * id de la oferta
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * id de la oferta
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * detalle de la oferta
	 */
	public void setDetalle(String value) {
		this.detalle = value;
	}
	
	/**
	 * detalle de la oferta
	 */
	public String getDetalle() {
		return detalle;
	}
	
	/**
	 * email del ofertante
	 */
	public void setMail(String value) {
		this.mail = value;
	}
	
	/**
	 * email del ofertante
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * fecha de vigencia de la oferta
	 */
	public void setFecha_vigencia(String value) {
		this.fecha_vigencia = value;
	}
	
	/**
	 * fecha de vigencia de la oferta
	 */
	public String getFecha_vigencia() {
		return fecha_vigencia;
	}
	
	/**
	 * fecha de publicacion de la oferta
	 */
	public void setFecha_publicacion(String value) {
		this.fecha_publicacion = value;
	}
	
	/**
	 * fecha de publicacion de la oferta
	 */
	public String getFecha_publicacion() {
		return fecha_publicacion;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
