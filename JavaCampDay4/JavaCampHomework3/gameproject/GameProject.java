
package gameproject;

public class GameProject {

    public static void main(String[] args) {
        Player player1=new Player("12345678910","Ayşe","Yılmaz","04.06.1985");
        PlayerManager playerManager=new PlayerManager(new PlayerCheckManager());
        playerManager.enroll(player1);
        
        Product game1=new Product(1,"Mario",50);
        ProductManager productManager=new ProductManager();
        productManager.add(game1);
        
        Order order1 =new Order(1,player1,game1);
        OrderManager ordermanager=new OrderManager();
        ordermanager.add(order1);
        
        Campaign campaign1=new Campaign(1,"%15 discount",15);
        CampaignManager campaignManager=new CampaignManager();
        campaignManager.add(campaign1);
        
        Order order2=new Order(2,player1,game1);
        ordermanager.setCampaign(campaign1);
        ordermanager.add(order2);
        
    
    }
    
}
