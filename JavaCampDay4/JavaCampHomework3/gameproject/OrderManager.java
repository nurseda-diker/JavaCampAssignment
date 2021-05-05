
package gameproject;

public class OrderManager implements OrderService{
    
    
    Campaign campaign;
    PlayerCheckService playerCheckService;
   
    public OrderManager(){
        
    }
    
    public OrderManager(PlayerCheckService playerCheckService){
        this.playerCheckService=playerCheckService;
    }
   
    
    @Override
    public void add(Order order) {
      if(this.playerCheckService.checkPlayer(order.getPlayer())){
        if(campaign!=null){
            
            double price=order.getProduct().getPrice();
            double discount=this.campaign.getDiscount();
            price=price - (price*discount/100);
            System.out.println("---------");
            System.out.println("Kampanya uygulandı!");
        
            System.out.println("Sipariş eklendi.\nSipariş id: "+order.getId()+"\nÜrün adı: "+order.getProduct().getName() + 
                                            "\nYeni fiyat: "+ price);
        }
      }
    }

    @Override
    public void update(Order order) {
        System.out.println("Sipariş güncellendi: "+order.getId());
    }

    @Override
    public void delete(Order order) {
        System.out.println("Sipariş silindi: "+order.getId());
    }

    @Override
    public void setCampaign(Campaign campaign) {
        this.campaign=campaign;
    }
    
}
