package art.dborg.animalservice.v1.service.abstracts;

import art.dborg.animalservice.v1.model.Animal;

import java.util.Optional;

public interface AnimalService {
    Animal addByAnimal(Animal animal);
    Animal updateByAnimal(Animal animal);
    Animal findByAnimal(Long id);
    Animal findByName(String name);
    boolean deleteById(Long id);
}
