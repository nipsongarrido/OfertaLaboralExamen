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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class OfertaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression detalle;
	public final StringExpression mail;
	public final StringExpression fecha_vigencia;
	public final StringExpression fecha_publicacion;
	
	public OfertaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		detalle = new StringExpression("detalle", this);
		mail = new StringExpression("mail", this);
		fecha_vigencia = new StringExpression("fecha_vigencia", this);
		fecha_publicacion = new StringExpression("fecha_publicacion", this);
	}
	
	public OfertaCriteria(PersistentSession session) {
		this(session.createCriteria(Oferta.class));
	}
	
	public OfertaCriteria() throws PersistentException {
		this(orm.OfertaLaboralPersistentManager.instance().getSession());
	}
	
	public Oferta uniqueOferta() {
		return (Oferta) super.uniqueResult();
	}
	
	public Oferta[] listOferta() {
		java.util.List list = super.list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

