
package fr.limayrac.frais.model;
import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "frais")
public class Frai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, length = 50)
    private Long id;
    @Column(name = "Intituler", nullable = false, length = 20)
    private String Intituler;
    @Column(name = "Date", nullable = false, length = 20)

    private String Date;
    @Column(name = "Lieu", nullable = false, length = 20)

    private String Lieu;

    @Column(name = "Transport", nullable = false, length = 20)

    private String Transport;
    @Column(name = "Hebergement", nullable = false, length = 20)

    private String Hebergement;

    @Column(name = "Restauration", nullable = false, length = 20)

    private String Reestauration;

    @Column(name = "CoordonnerBancaire", nullable = false, length = 20)

    private String CoordonnerBancaire;
}