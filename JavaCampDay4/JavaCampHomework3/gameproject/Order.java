
package gameproject;

public class Order {
    private int id;
    private Player player;
    private Product product;

    public Order(int id, Player player, Product product) {
        this.id = id;
        this.player = player;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
    
    
    
}
