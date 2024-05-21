package art.dborg.customerservice.v1.service.concretes;

import art.dborg.customerservice.v1.client.AnimalServiceClient;
import art.dborg.customerservice.v1.dto.AddAnimalRequest;
import art.dborg.customerservice.v1.dto.Animal;
import art.dborg.customerservice.v1.model.Customer;
import art.dborg.customerservice.v1.repository.CustomerRepository;
import art.dborg.customerservice.v1.service.abstracts.CustomerService;
import org.apache.tomcat.jni.Library;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CustomerManager implements CustomerService {

    private final CustomerRepository customerRepository;
    private final AnimalServiceClient animalServiceClient;

    public CustomerManager(CustomerRepository customerRepository, AnimalServiceClient animalServiceClient) {
        this.customerRepository = customerRepository;
        this.animalServiceClient = animalServiceClient;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findByCustomerId(Long id) {
        return customerRepository.findById(id).orElseThrow();
    }

    @Override
    public Customer getAllAnimalInCustomerById(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        customer.getAnimals().stream().map(animalServiceClient::getByAnimalId).collect(Collectors.toList());
        return customer;
    }

    @Override
    public void addAnimalByName(AddAnimalRequest request){
        Long animalId = animalServiceClient.getByAnimalName(request.getName()).getBody().getId();
        Customer customer = customerRepository.findById(request.getId()).orElseThrow();

        customer.getAnimals().add(animalId);
        customerRepository.save(customer);
    }

}
