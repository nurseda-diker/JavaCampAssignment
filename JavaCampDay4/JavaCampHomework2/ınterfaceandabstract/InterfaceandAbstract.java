
package ınterfaceandabstract;

public class InterfaceandAbstract {

   
    public static void main(String[] args) {
        
        BaseCustomerManager customerManager=new NeroCustomerManager();
        Customer customer=new Customer();
        customer.setId(1);
        customer.setDateofBirth("20.01.2000");
        customer.setFirstName("Nur");
        customer.setLastName("Diker");
        customer.setNationalityId("45621666478");
        
        customerManager.save(customer);
        
    
        
                
        
        
        
        
    }
    
}
