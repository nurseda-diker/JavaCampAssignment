
package ınterfaceandabstract;

public abstract class BaseCustomerManager implements ICustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println("Save to db: "+customer.getFirstName());
    }
    
    public boolean CheckIfRealPerson(Customer customer){
        return true;
    }

    
    
}
