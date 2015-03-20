/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteOfertaLaboralData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.OfertaLaboralPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Oferta lormOferta = orm.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			orm.OfertaDAO.delete(lormOferta);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteOfertaLaboralData deleteOfertaLaboralData = new DeleteOfertaLaboralData();
			try {
				deleteOfertaLaboralData.deleteTestData();
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
