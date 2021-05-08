package nLayeredArchitecture.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredArchitecture.dataAccess.abstracts.UserDao;
import nLayeredArchitecture.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	List<User> users=new ArrayList<>();
	

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void login(User user) {
		System.out.println("Hibernate ile giriþ yapýldý.");
		
	}


	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Hibernate ile kullanýcý sisteme eklendii.");
		
	}

	

}
