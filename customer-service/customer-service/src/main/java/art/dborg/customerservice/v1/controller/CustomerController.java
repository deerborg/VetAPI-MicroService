package art.dborg.customerservice.v1.controller;

import art.dborg.customerservice.v1.dto.AddAnimalRequest;
import art.dborg.customerservice.v1.model.Customer;
import art.dborg.customerservice.v1.service.abstracts.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.findByCustomerId(id);
    }
    @GetMapping("/list/{id}")
    public Customer getAllAnimalInCustomerById(@PathVariable Long id){
        return customerService.getAllAnimalInCustomerById(id);
    }
    @PutMapping
    public ResponseEntity<Void> addAnimalToCustomer(@RequestBody AddAnimalRequest request){
        customerService.addAnimalByName(request);
        return ResponseEntity.ok().build();
    }
}
