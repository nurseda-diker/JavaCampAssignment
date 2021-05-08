package nLayeredArchitecture.core.abstracts;

import nLayeredArchitecture.entities.concretes.User;

public interface LogService {
	void sendEmail(User user);
	void completeRegistration(User user);
}
