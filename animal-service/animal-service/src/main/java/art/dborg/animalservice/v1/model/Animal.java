package art.dborg.animalservice.v1.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id",columnDefinition = "serial")
    private Long id;
    private String name;

    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;


// Getter - Setter - Constructor

    public Animal() {
    }

    public Animal(Long id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
