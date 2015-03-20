package webservice;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.orm.PersistentTransaction;

public class ServicioOferta {
	
	/**
	 * crear una nueva oferta en el sistema
	 * @param ofertaVO
	 * @return String
	 */
	public String crearOferta(domain.OfertaVO ofertaVO) {
		try {
			PersistentTransaction t = orm.OfertaLaboralPersistentManager
					.instance().getSession().beginTransaction();
			try {
				orm.Oferta lormOferta = orm.OfertaDAO.createOferta();
				lormOferta.setDetalle(ofertaVO.getDetalle());
				lormOferta.setMail(ofertaVO.getMail());
				lormOferta.setFecha_vigencia(ofertaVO.getFechaVigencia());
				Calendar cal = new GregorianCalendar();
				String fecha = "" + cal.get(Calendar.YEAR) + "/"
						+ (cal.get(Calendar.MONTH) + 1) + "/"
						+ cal.get(Calendar.DAY_OF_MONTH);
				fecha += " " + cal.get(Calendar.HOUR_OF_DAY) + ":"
						+ cal.get(Calendar.MINUTE) + ":"
						+ cal.get(Calendar.SECOND);
				lormOferta.setFecha_publicacion(fecha);
				System.out.println(fecha);
				t.commit();
				System.out.println("--->"+fecha);
			} catch (Exception e) {
				t.rollback();
				return e.getMessage();
			}
		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}

		return "Usuario Creado";
	}
	
	/**
	 * obtencion de las ofertas ingresadas
	 * @return domain.OfertaVo[]
	 */
	public domain.OfertaVO[] obtenerOfertas() {
		domain.OfertaVO[] ofertas = null;
		System.out.println("LLEGUE AQUI");
		try {

			orm.Oferta[] ormOferta = orm.OfertaDAO
					.listOfertaByQuery(null, null);
			ofertas = new domain.OfertaVO[ormOferta.length];
			for (int i = 0; i < ofertas.length; i++) {
				ofertas[i] = new domain.OfertaVO();
				ofertas[i].setDetalle(ormOferta[i].getDetalle());
				ofertas[i].setMail(ormOferta[i].getMail());
				ofertas[i].setFechaVigencia(ormOferta[i].getFecha_vigencia());
				ofertas[i].setFechaPublicacion(ormOferta[i]
						.getFecha_publicacion());
			}
		} catch (Exception e) {
			return ofertas;
		}
		return ofertas;
	}
}
