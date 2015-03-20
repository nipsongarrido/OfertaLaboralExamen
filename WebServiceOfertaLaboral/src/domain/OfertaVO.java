package domain;

public class OfertaVO {
	/**
	 * atributos de la oferta
	 */
	private String detalle;
	private String mail;
	private String fechaVigencia;
	private String fechaPublicacion;
	
	/**
	 * instancia una nueva oferta
	 */
	public OfertaVO() {
	}
	
	/**
	 * instancia una nueva oferta
	 * 
	 * @param detalle
	 * @param mail
	 * @param fechaVigencia
	 * @param fechaPublicacion
	 */
	public OfertaVO(String detalle, String mail, String fechaVigencia,
			String fechaPublicacion) {
		super();
		this.detalle = detalle;
		this.mail = mail;
		this.fechaVigencia = fechaVigencia;
		this.fechaPublicacion = fechaPublicacion;
	}
	
	/**
	 * obtener el detalle de la oferta
	 * @return
	 */
	public String getDetalle() {
		return detalle;
	}
	
	/**
	 * insertar detalle de la oferta
	 * @param detalle
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	/**
	 * obtener email de la oferta
	 * @return
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * insertar email de la oferta
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * obtener fecha vigencia de la oferta
	 * @return
	 */
	public String getFechaVigencia() {
		return fechaVigencia;
	}
	
	/**
	 * insertar fecha vigencia de la oferta
	 * @param fechaVigencia
	 */
	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	
	/**
	 * obtener fecha publicacion de la oferta
	 * @return
	 */
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	/**
	 * insertar fecha publicacion de la oferta
	 * @param fechaPublicacion
	 */
	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	
}
