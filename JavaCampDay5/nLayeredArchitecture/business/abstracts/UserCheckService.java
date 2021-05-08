package nLayeredArchitecture.business.abstracts;

import java.util.List;

import nLayeredArchitecture.entities.concretes.User;


public interface UserCheckService {
		boolean checkFirstName(User user);
		boolean checkLastName(User user);
		boolean checkPassword(User user);
		boolean checkEmail(User user);
		boolean doesEmailExist(User user,List<User> users); 
		boolean validateAll(User user);
		boolean login(User user);
		
		
}
