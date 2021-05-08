package nLayeredArchitecture.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredArchitecture.business.abstracts.UserCheckService;
import nLayeredArchitecture.entities.concretes.User;


public class UserCheckManager implements UserCheckService{
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length() >= 2) {
			return true;
		}else {
			System.out.println("Ýsim en az 2 karakterden oluþmalýdýr.");
		    return false;
		}
	}
	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length() >= 2) {
			return true;
		}else {
			System.out.println("Soyad en az 2 karakterden oluþmalýdýr.");
			return false;
		}
	}
	@Override
	public boolean checkPassword(User user) {
		if(user.getParola().length() >= 6) {
			return true;
		}else {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return false;
		}
	}
	
	
	
	@Override
	public boolean checkEmail(User user) {
		if(VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEposta()).find()) {
			return true;
		}else {
			System.out.println("Email formatý doðru deðil.");
			return false;
		}
	}
	@Override
	public boolean doesEmailExist(User user, List<User> users) {
		for(User user1:users) {
			if(user1.getEposta().equals(user.getEposta())) {
				System.out.println("Bu email sistemde mevcut!");
				return true;
			}
		}
		
		return false;
	}
	@Override
	public boolean validateAll(User user) {
			if(checkFirstName(user) && checkLastName(user) && checkEmail(user)
				&& checkPassword(user))	
			{
				return true;
			}
		
		return false;
	}
	@Override
	public boolean login(User user) {
		if(checkFirstName(user) && checkLastName(user) && checkEmail(user)
				&& checkPassword(user)) {
			System.out.println("Giriþ baþarýlý.");
		}
		return false;
	}
	


		

	
	
	

}
