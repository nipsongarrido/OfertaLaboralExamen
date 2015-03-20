/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListOfertaLaboralData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Oferta...");
		orm.Oferta[] ormOfertas = orm.OfertaDAO.listOfertaByQuery(null, null);
		int length = Math.min(ormOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Oferta by Criteria...");
		orm.OfertaCriteria lormOfertaCriteria = new orm.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormOfertaCriteria.id.eq();
		lormOfertaCriteria.setMaxResults(ROW_COUNT);
		orm.Oferta[] ormOfertas = lormOfertaCriteria.listOferta();
		int length =ormOfertas== null ? 0 : Math.min(ormOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOfertaLaboralData listOfertaLaboralData = new ListOfertaLaboralData();
			try {
				listOfertaLaboralData.listTestData();
				//listOfertaLaboralData.listByCriteria();
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
