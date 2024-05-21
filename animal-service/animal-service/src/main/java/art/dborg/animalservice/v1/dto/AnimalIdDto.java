package art.dborg.animalservice.v1.dto;

public class AnimalIdDto {
    private Long id;

    public AnimalIdDto(Long id) {
        this.id = id;
    }

    public AnimalIdDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
