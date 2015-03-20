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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class OfertaDAO {
	public static Oferta loadOfertaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return loadOfertaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return getOfertaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return loadOfertaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return getOfertaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Oferta) session.load(orm.Oferta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Oferta) session.get(orm.Oferta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Oferta) session.load(orm.Oferta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta getOfertaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Oferta) session.get(orm.Oferta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return queryOferta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return queryOferta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return listOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return listOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOferta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Oferta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOferta(session, condition, orderBy);
			return (Oferta[]) list.toArray(new Oferta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta[] listOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOferta(session, condition, orderBy, lockMode);
			return (Oferta[]) list.toArray(new Oferta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return loadOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return loadOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Oferta[] ofertas = listOfertaByQuery(session, condition, orderBy);
		if (ofertas != null && ofertas.length > 0)
			return ofertas[0];
		else
			return null;
	}
	
	public static Oferta loadOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Oferta[] ofertas = listOfertaByQuery(session, condition, orderBy, lockMode);
		if (ofertas != null && ofertas.length > 0)
			return ofertas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOfertaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return iterateOfertaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOfertaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.OfertaLaboralPersistentManager.instance().getSession();
			return iterateOfertaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOfertaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOfertaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Oferta as Oferta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Oferta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta createOferta() {
		return new orm.Oferta();
	}
	
	public static boolean save(orm.Oferta oferta) throws PersistentException {
		try {
			orm.OfertaLaboralPersistentManager.instance().saveObject(oferta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Oferta oferta) throws PersistentException {
		try {
			orm.OfertaLaboralPersistentManager.instance().deleteObject(oferta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Oferta oferta) throws PersistentException {
		try {
			orm.OfertaLaboralPersistentManager.instance().getSession().refresh(oferta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Oferta oferta) throws PersistentException {
		try {
			orm.OfertaLaboralPersistentManager.instance().getSession().evict(oferta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Oferta loadOfertaByCriteria(OfertaCriteria ofertaCriteria) {
		Oferta[] ofertas = listOfertaByCriteria(ofertaCriteria);
		if(ofertas == null || ofertas.length == 0) {
			return null;
		}
		return ofertas[0];
	}
	
	public static Oferta[] listOfertaByCriteria(OfertaCriteria ofertaCriteria) {
		return ofertaCriteria.listOferta();
	}
}
