
package gameproject;

public class ProductManager implements ProductService{

    @Override
    public void add(Product product) {
        System.out.println("----------");
        System.out.println("Oyun eklendi: "+ product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Oyun güncellendi: "+product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Oyun silindi: "+product.getName());
    }
    
}
