package az.atlacademy.tech_store.tech_store.entity;

import az.atlacademy.tech_store.tech_store.enums.ModelType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="models")
public class Model {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private ModelType type;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "model_id")
    private List<ModelProperty> modelPropertyList= new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    private Brand brand;
}
