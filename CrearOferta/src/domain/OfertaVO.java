package domain;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class OfertaVO implements KvmSerializable{
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

	@Override
	public String getInnerText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getProperty(int arg0) {
		switch(arg0)
        {
        case 0:
            return detalle;
        case 1:
            return fechaPublicacion;
        case 2:
            return fechaVigencia;
        case 3:
            return mail;
        }
        
        return null;
	}

	@Override
	public int getPropertyCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable arg1, PropertyInfo info) {
		// TODO Auto-generated method stub
		switch(index)
        {
        case 0:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "detalle";
            break;
        case 1:
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fechaPublicacion";
            break;
        case 2:
        	info.type = PropertyInfo.STRING_CLASS;
            info.name = "fechaVigencia";
            break;
        case 3:
        	info.type = PropertyInfo.STRING_CLASS;
            info.name = "mail";
            break;
        default:break;
        }
	}

	@Override
	public void setInnerText(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProperty(int index, Object value) {
		// TODO Auto-generated method stub
		switch(index)
        {
        case 0:
        	detalle = value.toString();
            break;
        case 1:
            fechaPublicacion = value.toString();
            break;
        case 2:
            fechaVigencia = value.toString();
            break;
        case 3:
            mail = value.toString();
            break;
        }
	}
	
	
}
