package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager() {
        _customerCheckService = customerCheckService;
    }

    @Override
    public void Save(String efe, String customer) throws Exception{
        if (_customerCheckService.CheckIfRealPerson(customer)){
            super.Save(efe, customer);
        } else {
            throw new Exception("There is no such person!");
        }

    }

}