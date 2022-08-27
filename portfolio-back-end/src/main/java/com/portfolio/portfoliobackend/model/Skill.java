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
@Table(name = "skill")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Skill implements Serializable {

    @Id
    @SequenceGenerator(
            name = "skill_sequence",
            sequenceName = "skill_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "skill_sequence"
    )
    private Long id;

    @Column(name = "tecnologia",
            length = 100, nullable = false,
            unique = false)
    private String tecnologia;

    @Column(name = "porcentaje",
            length = 100, nullable = false,
            unique = false)
    private String porcentaje;

}
