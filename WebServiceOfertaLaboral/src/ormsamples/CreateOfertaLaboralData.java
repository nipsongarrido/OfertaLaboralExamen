/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateOfertaLaboralData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.OfertaLaboralPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Oferta lormOferta = orm.OfertaDAO.createOferta();
			// Initialize the properties of the persistent object here
			orm.OfertaDAO.save(lormOferta);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOfertaLaboralData createOfertaLaboralData = new CreateOfertaLaboralData();
			try {
				createOfertaLaboralData.createTestData();
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
