package nLayeredArchitecture.core.concretes;

import nLayeredArchitecture.core.abstracts.LogService;
import nLayeredArchitecture.entities.concretes.User;

public class LogManager implements LogService {

	@Override
	public void sendEmail(User user) {
		System.out.println(user.getFirstName() + " kullanýcýsýna doðrulama e-postasý gönderildi.");
		
	}

	@Override
	public void completeRegistration(User user) {
		System.out.println("Kayýt" + user.getFirstName() + "için tamamlandý.");
		
	}

}
