package art.dborg.customerservice.v1.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    private String name;
    private List<Long> animals = new ArrayList<>();


    // Getter - Setter - Constructor


    public Customer() {
    }

    public Customer(Long id, String name, List<Long> animals) {
        this.id = id;
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Long> animals) {
        this.animals = animals;
    }
}
