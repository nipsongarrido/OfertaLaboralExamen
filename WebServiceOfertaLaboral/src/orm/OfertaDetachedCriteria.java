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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class OfertaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression detalle;
	public final StringExpression mail;
	public final StringExpression fecha_vigencia;
	public final StringExpression fecha_publicacion;
	
	public OfertaDetachedCriteria() {
		super(orm.Oferta.class, orm.OfertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		detalle = new StringExpression("detalle", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		fecha_vigencia = new StringExpression("fecha_vigencia", this.getDetachedCriteria());
		fecha_publicacion = new StringExpression("fecha_publicacion", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.OfertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		detalle = new StringExpression("detalle", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		fecha_vigencia = new StringExpression("fecha_vigencia", this.getDetachedCriteria());
		fecha_publicacion = new StringExpression("fecha_publicacion", this.getDetachedCriteria());
	}
	
	public Oferta uniqueOferta(PersistentSession session) {
		return (Oferta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Oferta[] listOferta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

