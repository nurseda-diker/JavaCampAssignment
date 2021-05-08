package nLayeredArchitecture.dataAccess.abstracts;

import java.util.List;

import nLayeredArchitecture.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void login(User user);
	List<User> getAll();
	
}
