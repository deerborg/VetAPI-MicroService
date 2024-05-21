package art.dborg.customerservice.v1.service.abstracts;

import art.dborg.customerservice.v1.dto.AddAnimalRequest;
import art.dborg.customerservice.v1.model.Customer;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer findByCustomerId(Long id);
    Customer getAllAnimalInCustomerById(Long id);
    void addAnimalByName(AddAnimalRequest request);
}
