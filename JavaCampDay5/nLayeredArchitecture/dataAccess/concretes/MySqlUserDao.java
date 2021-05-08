package nLayeredArchitecture.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredArchitecture.dataAccess.abstracts.UserDao;
import nLayeredArchitecture.entities.concretes.User;

public class MySqlUserDao implements UserDao {

	List<User> users=new ArrayList<User>();
	

	@Override
	public void login(User user) {
		System.out.println("Giriþ baþarýlý.");
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("MySql ile kullanýcý sisteme eklendi.");
		
	}

	
	
}
