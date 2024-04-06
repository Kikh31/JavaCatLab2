package Entities;

import Enums.Color;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "cats")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private Integer catId;

    //private Integer ownerId;
    @ManyToOne
    @JoinColumn(name="owner_id", nullable = false)
    private Owner owner;

    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String breed;

    @Enumerated(EnumType.STRING)
    private Color color;
}
