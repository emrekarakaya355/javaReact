package adapters.concretes;

import java.rmi.RemoteException;

import business.abstracts.CustomerCheckService;
import enitities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfCustomerReal(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublicSoapProxy =new KPSPublicSoapProxy();
		try {
			if(kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), 
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDayOfBirth().getYear())) {
				return true;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
