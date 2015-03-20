/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateOfertaLaboralData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.OfertaLaboralPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Oferta lormOferta = orm.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			orm.OfertaDAO.save(lormOferta);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Oferta by OfertaCriteria");
		orm.OfertaCriteria lormOfertaCriteria = new orm.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormOfertaCriteria.id.eq();
		System.out.println(lormOfertaCriteria.uniqueOferta());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOfertaLaboralData retrieveAndUpdateOfertaLaboralData = new RetrieveAndUpdateOfertaLaboralData();
			try {
				retrieveAndUpdateOfertaLaboralData.retrieveAndUpdateTestData();
				//retrieveAndUpdateOfertaLaboralData.retrieveByCriteria();
			}
			finally {
				orm.OfertaLaboralPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
