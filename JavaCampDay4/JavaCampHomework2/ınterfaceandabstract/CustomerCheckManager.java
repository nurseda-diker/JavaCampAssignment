
package ─▒nterfaceandabstract;


public class CustomerCheckManager implements IPersonCheckService {

    
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
    

    
}
