package art.dborg.animalservice.v1.controller;

import art.dborg.animalservice.v1.model.Animal;
import art.dborg.animalservice.v1.service.abstracts.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/animals")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping
    public ResponseEntity<Animal> addAnimal(@RequestBody Animal animal){
        return ResponseEntity.ok(animalService.addByAnimal(animal));
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<Animal> getByAnimalName(@PathVariable String name){
        return ResponseEntity.ok(animalService.findByName(name));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Animal> getByAnimalId(@PathVariable Long id){
        return ResponseEntity.ok(animalService.findByAnimal(id));
    }
}
