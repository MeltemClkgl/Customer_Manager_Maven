package Abstract;

import Entities.Customer;

public interface ICustomerService {
    void Save(String efe, String customer) throws Exception;

    void Save(Customer customer) throws Exception;

    void Delete(Customer customer);

    void StarPoint(Customer customer);
}