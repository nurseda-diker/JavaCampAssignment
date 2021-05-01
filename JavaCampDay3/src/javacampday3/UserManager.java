
package javacampday3;

public class UserManager {
    public void newUser(User user){
        System.out.println("----------");
        System.out.println("Yeni kursiyerin adı:"+user.getFirstName()+"\nSoyadı: "+ user.getLastName()+"\nEmaili: "+user.getEmail());
    }

   
    
}
