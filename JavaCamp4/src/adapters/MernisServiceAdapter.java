package adapters;

import java.rmi.RemoteException;

import business.abstracts.CustomerCheckService;
import enitities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@SuppressWarnings("deprecation")
	@Override
	public boolean checkIfPersonReal(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			
			if(kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNatioanalIdentity()),customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase()
					,customer.getDateOfBirth().getYear())) {
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
