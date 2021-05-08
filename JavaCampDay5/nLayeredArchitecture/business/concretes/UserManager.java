package nLayeredArchitecture.business.concretes;



import nLayeredArchitecture.business.abstracts.UserCheckService;
import nLayeredArchitecture.business.abstracts.UserService;
import nLayeredArchitecture.core.abstracts.LogService;
import nLayeredArchitecture.dataAccess.abstracts.UserDao;
import nLayeredArchitecture.entities.concretes.User;
import nLayeredArchitecture.googleUser.GoogleUserManager;

public class UserManager implements UserService {
	
	private UserDao dataBase; 
	private LogService logService;
	private UserCheckService userCheckService;
	
	public UserManager(UserDao dataBase, LogService logService) {
		super();
		this.dataBase = dataBase;
		this.logService = logService;
	}

	UserCheckManager userCheckManager =new UserCheckManager();

	@Override
	public void register(User user) {
		if(userCheckManager.validateAll(user)) {
			dataBase.add(user);
			logService.sendEmail(user);
			System.out.println("Kayýt baþarýlý");
			
		}
		
	}

	@Override
	public void login(User user) {
		if(userCheckManager.validateAll(user)) {
			dataBase.add(user);
			System.out.println("Giriþ baþarýlý");
		}
		
	}





	














	
	
	
	
}
