package art.dborg.customerservice.v1.dto;

import java.time.LocalDate;

public class AddAnimalRequest {
    private Long id;
    private String name;

    // Getter - Setter


    public AddAnimalRequest() {
    }

    public AddAnimalRequest(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
