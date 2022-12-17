package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements Abstract.ICustomerService {

    @Override
    public void Save(Customer customer ) throws Exception {
        System.out.println("Saved to data base: "  + customer.FirstName + " " + customer.LastName + " ");
        StarPoint(customer);
    }

    @Override
    public void Delete(Customer customer){
        System.out.println("Customer NationalityId : " + "-" + customer.NationalityId + " Customer Deleted " );

    }

    @Override
    public void StarPoint(Customer customer){
        System.out.println(customer.FirstName + " - " + customer.LastName + " Get Star Point '1' ");
    }


}
