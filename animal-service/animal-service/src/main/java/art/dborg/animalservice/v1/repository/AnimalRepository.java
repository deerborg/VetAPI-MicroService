package art.dborg.animalservice.v1.repository;

import art.dborg.animalservice.v1.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
    Animal findByName(String name);
}
