package art.dborg.customerservice.v1.client;

import art.dborg.customerservice.v1.dto.Animal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "animal-service",path = "/v1/animals")
public interface AnimalServiceClient {

    @GetMapping("/name/{name}")
    public ResponseEntity<Animal> getByAnimalName(@PathVariable String name);

    @GetMapping("/{id}")
    public ResponseEntity<Animal> getByAnimalId(@PathVariable Long id);
}
