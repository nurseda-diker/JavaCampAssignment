package nLayeredArchitecture;

import nLayeredArchitecture.business.abstracts.UserService;
import nLayeredArchitecture.business.concretes.UserManager;
import nLayeredArchitecture.core.concretes.LogManager;
import nLayeredArchitecture.dataAccess.abstracts.UserDao;
import nLayeredArchitecture.dataAccess.concretes.MySqlUserDao;
import nLayeredArchitecture.entities.concretes.User;
import nLayeredArchitecture.googleUser.GoogleUserManager;

public class Main {

	public static void main(String[] args) {
		UserDao dao=new MySqlUserDao();
		UserService userService=new UserManager(dao,new LogManager());
		User user1 = new User("Nur","Diker","nurdiker@gmail.com","123456");

		userService.register(user1);
		userService.login(user1);
		
		User user2=new User("B","Yýlmaz","bernayilmaz@gmail.com","456789");
		userService.register(user2);
		
		GoogleUserManager google =new GoogleUserManager();
		google.logwithGoogle(user1);
		
		
		
		
	}

}
