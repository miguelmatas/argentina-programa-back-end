package com.portfolio.portfoliobackend.model;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "experiencia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Experiencia implements Serializable {

    @Id
    @SequenceGenerator(
            name = "experiencia_sequence",
            sequenceName = "experiencia_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "experiencia_sequence"
    )
    private Long id;

    @Column(name = "url_logo",
            length = 150,
            nullable = false,
            unique = false)
    private String url_logo;

    @Column(name = "rol_laboral",
            length = 45,
            nullable = false,
            unique = false)
    private String rol;

    @Column(name = "establecimiento",
            length = 45, nullable = false,
            unique = false)
    private String establecimiento;

    @Column(name = "localidad",
            length = 45, nullable = false,
            unique = false)
    private String localidad;

    private Integer inicio;

    private Integer fin;

}
