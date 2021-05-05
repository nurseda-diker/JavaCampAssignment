
package ınterfaceandabstract;



public class StarbucksCustomerManager extends BaseCustomerManager {
   
    ICustomerService _customerService;
    
    
    public StarbucksCustomerManager(ICustomerService customerService){
        _customerService=customerService;
    }
    
    @Override
    public void save(Customer customer){
        System.out.println("Starbucks müşteri kaydedildi." + customer.getFirstName()+ " " +customer.getLastName());
        //BaseCustomerManager starbucksCustomer=new BaseCustomerManager();
        if(_customerService.CheckIfRealPerson(customer)){
             _customerService.save(customer);
        }else{
            System.out.println("Not a valid person");
        }
    }

    
    
    
    
    
     
    
}
