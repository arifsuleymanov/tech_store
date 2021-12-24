package az.atlacademy.tech_store.tech_store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "model_properties")
public class ModelProperty {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    private Double price;
    private String cpu;
    private String ram;
    private Double screen;
    private Double camera;
    private String battery;
    private Long stockCount;
    private String storage;
    private Boolean nfc;
    private Boolean bluetooth;
    private Boolean wifi;
    private String connection;
    private String chargeType;
    private String extraProperty;

    @ManyToOne
    @JsonIgnore
    private Model model;
}
