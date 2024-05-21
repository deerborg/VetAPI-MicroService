package art.dborg.animalservice.v1.service.concretes;

import art.dborg.animalservice.v1.model.Animal;
import art.dborg.animalservice.v1.repository.AnimalRepository;
import art.dborg.animalservice.v1.service.abstracts.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimalManager implements AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalManager(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Animal addByAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal updateByAnimal(Animal animal) {
        findByAnimal(animal.getId());
        return animalRepository.save(animal);
    }

    @Override
    public Animal findByAnimal(Long id) {
        return animalRepository.findById(id).orElseThrow();
    }

    @Override
    public boolean deleteById(Long id) {
        animalRepository.delete(findByAnimal(id));
        return true;
    }

    @Override
    public Animal findByName(String name) {
        return animalRepository.findByName(name);
    }
}
