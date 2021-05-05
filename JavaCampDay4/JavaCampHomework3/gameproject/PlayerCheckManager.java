
package gameproject;

public class PlayerCheckManager implements PlayerCheckService{

    @Override
    public boolean checkPlayer(Player player) {
        if(player.getFirstName().isEmpty()|| player.getLastName().isEmpty()
                                          || player.getDateofBirth().isEmpty()
                                          || player.getTcNo().isEmpty())
            
        {
            return false;
        }
        else{
            return true;
        }
        
      
    }
    
}
