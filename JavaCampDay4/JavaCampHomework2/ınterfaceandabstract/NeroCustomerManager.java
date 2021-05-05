
package ınterfaceandabstract;

public class NeroCustomerManager extends BaseCustomerManager{

    @Override
	public void save(Customer customer) {
		System.out.println("Nero müşteri kaydedildi: "+customer.getFirstName()+" " +customer.getLastName());
		
	}
    
}
