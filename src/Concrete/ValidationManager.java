package Concrete;

import java.rmi.RemoteException;

import Abstracts.ValidationService;
import Entities.Player;

public class ValidationManager implements ValidationService {

	@Override
	public boolean checkIfRealPerson(Player player) {
//		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
//
//		try {
//			return client.TCKimlikNoDogrula(Long.parseLong(player.getIdTCNo()), player.getName().toUpperCase(),
//					player.getSurname().toUpperCase(), player.getBirthdate().getYear());
//		} catch (RemoteException e) {
//
//			e.printStackTrace();
//		}
		return false;
	}

}
