package nLayeredArchitecture.core.concretes;

import nLayeredArchitecture.core.abstracts.LogService;
import nLayeredArchitecture.entities.concretes.User;

public class LogManager implements LogService {

	@Override
	public void sendEmail(User user) {
		System.out.println(user.getFirstName() + " kullan�c�s�na do�rulama e-postas� g�nderildi.");
		
	}

	@Override
	public void completeRegistration(User user) {
		System.out.println("Kay�t" + user.getFirstName() + "i�in tamamland�.");
		
	}

}
