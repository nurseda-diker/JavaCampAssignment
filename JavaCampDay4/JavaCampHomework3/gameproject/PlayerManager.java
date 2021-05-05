
package gameproject;

public class PlayerManager implements PlayerService{
    
    PlayerCheckService playerCheckService;
    

    
    public PlayerManager(PlayerCheckService playerCheckService){
        this.playerCheckService=playerCheckService;
    }
    
    @Override
    public void enroll(Player player) {
        if(checkPlayer(player)){
            System.out.println("----------");
           System.out.println("Oyuncu sisteme kayıt edildi:" + player.getFirstName() + " " + player.getLastName()); 
        }
        else{
           System.out.println("Oyuncu sisteme kaydedilemedi!!");
        }
    }

    @Override
    public void update(Player player) {
        if(checkPlayer(player)){
           System.out.println("Oyuncunun bilgileri güncellendi:" + player.getFirstName() + " " + player.getLastName()); 
        }
        else{
            System.out.println("Oyuncunun bilgileri güncellenemedi!!");
        }
    }

    @Override
    public void delete(Player player) {
       System.out.println("Oyuncu silindi:" + player.getFirstName() + " " + player.getLastName());
    }

    private boolean checkPlayer(Player player) {
        return playerCheckService.checkPlayer(player);
    }
}
