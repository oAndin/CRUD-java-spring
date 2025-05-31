package Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Product {

    // Marcação que esse será uma primary key
    @Id
    // Marcação para que o banco de dados gere a chave primaria
    // "IDENTITY" -> identificador único serão gerados pela coluna de auto incremento do banco de dados, Alguns bancos de dados podem não suportar essa opção.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do produto não pode estar vazio")
    @Column(nullable = false, length = 100)
    private String name;

    @Positive(message = "O preço deve ser maior que zero")
    private Integer priceInCents;

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

    public Integer getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(Integer priceInCents) {
        this.priceInCents = priceInCents;
    }
}