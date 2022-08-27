package com.portfolio.portfoliobackend.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "proyecto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Proyecto implements Serializable {

    @Id
    @SequenceGenerator(
            name = "proyecto_sequence",
            sequenceName = "proyecto_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "proyecto_sequence"
    )
    private Long id;

    private String proyectoTitulo;

    private String proyectoImg;

    private String proyectoInfo;


}
